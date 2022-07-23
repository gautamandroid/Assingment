package com.gautam.ecomerce_project

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.app.ProgressDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.Menu
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.gautam.ecomerce_project.R
import com.gautam.ecomerce_project.databinding.ActivitySignupBinding
import com.gautam.onbinding.Utils.Util
import java.util.*

class Singupactivity : AppCompatActivity() {

     lateinit var binding: ActivitySignupBinding
     private var GENDER=""
    private var terms = false
    private var storage = true
    private var isShown = false
    lateinit var dialog: ProgressDialog




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initProgress()

        binding.etDob.setOnFocusChangeListener { view, status->

            if (status){
                binding.etDob.clearFocus()
                showDatePickerDialog()
            }

        }

        binding.btnSignup.setOnClickListener{
       var fname =binding.etFName.text.toString().trim()
       var lname =binding.etLName.text.toString().trim()
       var email =binding.etEmail.text.toString().trim()
        var contect=binding.etContact.text.toString().trim()
       var password=binding.etPassword.text.toString().trim()
       var cpassword=binding.etCPassword.text.toString().trim()
      var dob=binding.etDob.text.toString().trim()

        validateForm(fname, lname, email, password, cpassword, contect,dob)
    }

        binding.mSwitch.setOnCheckedChangeListener { compoundButton, status ->

            storage = status
            if (!status && !isShown) {
                showAlert()
                isShown = true
            }


        }

}

    private fun initProgress() {
       dialog=ProgressDialog(this).apply {
           setMessage("please wait..")
           setCancelable(false)
       }
    }
    private fun showAlert(){

        AlertDialog.Builder(this)
            .setTitle("Alert")
            .setMessage("storsge option")
            .setPositiveButton("ok",DialogInterface.OnClickListener{ dialogInterface,i-> })
            .show()
    }

    private fun showDatePickerDialog() {

        val calendar = Calendar.getInstance()

        var date = calendar.get(Calendar.DAY_OF_MONTH)
        var month = calendar.get(Calendar.MONTH)
        var year = calendar.get(Calendar.YEAR)
        var etText=binding.etDob.text.toString().trim()
        if(!etText.equals(""))
        {
            date=etText.substring(0,2).toInt()
            month=etText.substring(3,5).toInt()-1
            year=etText.substring(6,10).toInt()
        }
        DatePickerDialog(this, {
                datePicker, year, month, date ->
            var dob = "${Util.getFormattedNumber(date)}-${Util.getFormattedNumber(month+1)}-$year"
            binding.etDob.setText(dob)
        },year,month,date).show()
    }

   private fun validateForm(
       fname:String,
       lname:String,
       email:String,
       passworld:String,
       cpassworld:String,
       contect:String,
       dob:String
   ) {
       resetFocus()


       if (fname.isEmpty()){
           setError(binding.etFName,"enter first name")
       }else if (lname.isEmpty()){
         setError(binding.etLName,"enter last name")
       }
       else if (!Util.isValidEmail(email)){
           setError(binding.etEmail,"enter valid email forment")
       }
       else if (!Util.isValidContact(contect)){
           setError(binding.etContact,"enter valid contect")
       }
       else if (dob.isEmpty()){
           setError(binding.etDob,"select date of barth")
       }
       else if (!Util.isValidpassword(passworld)){
           setError(binding.etPassword,"enter valid passworld")

       }
       else if (cpassworld !=passworld){
           setError(binding.etCPassword," passworld mistak")
       }
       else{
           var intent = Intent(this, HomeActivity::class.java)
           startActivity(intent)
       }

       

       }
       private  fun resetFocus(){
           binding.etFName.setBackgroundResource(R.drawable.et_bacgraund)
           binding.etLName.setBackgroundResource(R.drawable.et_bacgraund)
           binding.etPassword.setBackgroundResource(R.drawable.et_bacgraund)
           binding.etContact.setBackgroundResource(R.drawable.et_bacgraund)
           binding.etEmail.setBackgroundResource(R.drawable.et_bacgraund)
           binding.etCPassword.setBackgroundResource(R.drawable.et_bacgraund)
           binding.etDob.setBackgroundResource(R.drawable.et_bacgraund)


           binding.etFName.clearFocus()
           binding.etLName.clearFocus()
           binding.etEmail.clearFocus()
           binding.etPassword.clearFocus()
           binding.etContact.clearFocus()
           binding.etCPassword.clearFocus()
          binding.etDob.clearFocus()



       }
    private fun setError(editText: EditText,message: String){
        editText.setBackgroundResource(R.drawable.et_bacgraund_error)
        editText.requestFocus()
        Toast.makeText(applicationContext,message,Toast.LENGTH_SHORT).show()
    }


    fun onRadioButtonClicked(view: View) {
        when(view.id){
            R.id.rd_male->GENDER="male"
            R.id.rd_female->GENDER="femail"
            R.id.rd_other->GENDER="other"
        }
    }


}



