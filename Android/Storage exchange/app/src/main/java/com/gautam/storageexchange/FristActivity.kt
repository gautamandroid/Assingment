package com.gautam.storageexchange

import android.Manifest
import android.content.DialogInterface
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.util.Log
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.core.content.FileProvider
import com.gautam.storageexchange.databinding.ActivityFristBinding
import java.io.File
import java.io.FileDescriptor
import java.io.IOException


class FristActivity : AppCompatActivity() {


    val galleryContract = registerForActivityResult(ActivityResultContracts.GetContent()){
        it?.let {
            binding.ivProfile.setImageURI(it)

            uriToBitmap(it)?.let{
                saveImagetoExternalStorage(it)

            }

        }
    }

    private fun saveImagetoExternalStorage(bitmap:Bitmap) {

           val root=Environment.getExternalStorageDirectory()
        val path=File(root,"FILE STORAGE")
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show()

    }

    private val cameraContrCT=registerForActivityResult(ActivityResultContracts.TakePicture()){
        if(it){
            binding.ivProfile.setImageURI(imageUri)

            uriToBitmap(imageUri)?.let {
                saveImagetoExternalStorage(it)

            }

        }
    }
    

    private lateinit var binding: ActivityFristBinding

    private val requestMultipalePermission=registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()){
                   it.entries.forEach {
                       Log.e("DEBUG", "${it.key} = ${it.value}")
                   }
    }
    lateinit var imageUri: Uri



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFristBinding.inflate(layoutInflater)
        setContentView(binding.root)

      imageUri=createImageUri()!!

        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.READ_EXTERNAL_STORAGE
            ) == PackageManager.PERMISSION_GRANTED || ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
            ) == PackageManager.PERMISSION_GRANTED
        ) {
  
        } else {

            requestMultipalePermission.launch(
                arrayOf(
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE
                )
            )

        }


        binding.ivProfile.setOnClickListener {
            showAlertDialog()
        }


        binding.btnGallery.setOnClickListener {

           // showAlertDialog()
            /*var intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
            startActivityForResult(intent, 200)*/
//            galleryContract.launch("image/*")
        }

    }

    private fun showAlertDialog() {
        var iteam= arrayOf("Galley","camera")

        AlertDialog.Builder(this)
            .setTitle("pick image")
            .setIcon(R.drawable.ic_baseline_add_photo_alternate_24)
            .setItems(iteam, DialogInterface.OnClickListener { dialog, i ->


                when(i){
                    0->pickimageformGallery()
                    1->pickimagefromCamera()
                }

            }).show()

    }

    private fun pickimagefromCamera() {
       cameraContrCT.launch(imageUri)
    }

    private fun pickimageformGallery() {
     galleryContract.launch("image/*")
    }

    //TODO takes URI of the image and returns bitmap
    private fun uriToBitmap(selectedFileUri: Uri): Bitmap? {
        try {
            val parcelFileDescriptor = contentResolver.openFileDescriptor(selectedFileUri, "r")
            val fileDescriptor: FileDescriptor = parcelFileDescriptor!!.fileDescriptor
            val image = BitmapFactory.decodeFileDescriptor(fileDescriptor)
            parcelFileDescriptor.close()
            return image
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return null
    }


    /* override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
         super.onActivityResult(requestCode, resultCode, data)

         if(requestCode == 200){
             data?.let {
                 binding.ivProfile.setImageURI(it.data)
             }
         }

     }*/

    private fun createImageUri():Uri?{
        val image= File(applicationContext.filesDir,"camera_photo")
        return FileProvider.getUriForFile(
            applicationContext, "com.gautam.storageexchange.provider",
            image)}




}