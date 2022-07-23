package com.example.ecommerce

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.ecommerce.sharepref.PrefManager

class SpalshActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spalsh)

        Handler().postDelayed({
            var prefManager = PrefManager(this)
            if(!prefManager.getIntroStatus()){
                startActivity(Intent(this,OnBoardingActivity::class.java))

            }else{
                if(!prefManager.getLoginStatus()){
                    startActivity(Intent(this,HomeActivity::class.java))

                }/*else{
                    startActivity(Intent(this,MainActivity::class.java))

                }*/
            }
        },3000)

    }


}