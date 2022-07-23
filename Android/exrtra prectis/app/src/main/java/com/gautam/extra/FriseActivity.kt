package com.gautam.extra

import android.content.DialogInterface
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.core.content.FileProvider
import com.gautam.extra.databinding.ActivityFriseBinding
import java.io.File

class FriseActivity : AppCompatActivity() {

     val galleryContracts=registerForActivityResult(ActivityResultContracts.GetContent()){
       it?.let {
           binding.ivProfile.setImageURI(it)
       }
     }
     private  val cameraContracts=registerForActivityResult(ActivityResultContracts.TakePicture()){
     if (it){
          binding.ivProfile.setImageURI(imageUri)

          }
     }





     private lateinit var binding:ActivityFriseBinding
    lateinit var imageUri:Uri

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityFriseBinding.inflate(layoutInflater)
        setContentView(binding.root)

         imageUri=createImageUri()!!



        binding.ivProfile.setOnClickListener {

            showAlertDialoge()
        }
    }

    private fun showAlertDialoge() {
          var iteam= arrayOf("gallery","camera")

    AlertDialog.Builder(this)
        .setTitle("pick image")
        .setIcon(R.drawable.ic_baseline_home_24)
        .setItems(iteam,DialogInterface.OnClickListener { dialog, i ->

         when(i){
             0->pickimagefromGallery()
             1->picimagecamera()
         }

        }).show()
    }

    private fun picimagecamera() {
       cameraContracts.launch(imageUri)
    }

    private fun pickimagefromGallery() {
          galleryContracts.launch("image/*")
    }


    private fun createImageUri(): Uri? {
         val image=File(applicationContext.filesDir,"camera_photo")
            return FileProvider.getUriForFile(
                  applicationContext,"com.gautam.extra.fileprovider",
                  image
            )}
}