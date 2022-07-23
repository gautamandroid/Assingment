package com.gautam.storageexchange

import android.Manifest
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {


var REQ_GALLERY = 100
      val btbPermission:Button

      get() =findViewById(R.id.btn_permission)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btbPermission.setOnClickListener {

            if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
                askPermishion()
            }else{
                openGallery()
            }
        }

    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun askPermishion() {
        if(ContextCompat.checkSelfPermission(applicationContext, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED){
            openGallery()
        }else if(shouldShowRequestPermissionRationale(Manifest.permission.READ_EXTERNAL_STORAGE)){

            //showAlert()
             AlertDialog.Builder(this)
                 .setTitle("Alert")
                 .setMessage("by allowing this permission are able ofr pick filesfrom eternal storage")
                 .setPositiveButton("ok", DialogInterface.OnClickListener { dialogInterface, i ->

                     val intent = Intent(
                         Settings.ACTION_APPLICATION_DETAILS_SETTINGS,
                         Uri.fromParts("package", packageName, null)
                     )
                     intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                     startActivity(intent)

                 }).setNegativeButton("cancel", DialogInterface.OnClickListener { dialogInterface, i ->
                     dialogInterface.dismiss()
                 }).show()


        }else{
            // ask Permissionxl
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE), REQ_GALLERY)
            }
        }

    }

    private fun showAlert() {

    }

    private fun  checkpermision():Boolean{
     return  ContextCompat.checkSelfPermission( this,Manifest.permission.READ_EXTERNAL_STORAGE)==PackageManager.PERMISSION_GRANTED
    }

    private fun openGallery() {
        Toast.makeText(this,"permision allow",Toast. LENGTH_SHORT).show()
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if (requestCode==REQ_GALLERY){

            if (grantResults.isNotEmpty()&&grantResults[0]==PackageManager.PERMISSION_GRANTED){
                openGallery()

            }else{
                Toast.makeText(this,"permision deline",Toast.LENGTH_SHORT).show()
            }

        }


    }


}