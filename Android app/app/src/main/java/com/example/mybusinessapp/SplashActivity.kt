package com.example.mybusinessapp

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.appcompat.app.AppCompatDelegate
import com.airbnb.lottie.LottieAnimationView

class SplashActivity : AppCompatActivity() {
   private lateinit var cosmetic : LottieAnimationView
   private lateinit var loadind: LottieAnimationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_splash)

        supportActionBar?.hide()

        cosmetic = findViewById(R.id.productsIcon)
        loadind = findViewById(R.id.loadingAnimation)


        //cosmetic.animate().translationY(0F).setDuration(2000).setStartDelay(4000)
        //loadind.animate().translationY(0F).setDuration(1000).setStartDelay(4000)


        Handler().postDelayed({
            val intent = Intent(applicationContext, MainActivity::class.java)
            //startActivity(intent)
            //finish()
        },4000)
    }

}