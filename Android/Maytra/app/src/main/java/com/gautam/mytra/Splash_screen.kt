package com.gautam.mytra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.gautam.mytra.databinding.ActivitySplashScreenBinding

class Splash_screen : AppCompatActivity() {


    lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler().postDelayed({

            val intent= Intent(this,HomeActivity::class.java)
            startActivity(intent)
            finish()


        },2000)

    }
}