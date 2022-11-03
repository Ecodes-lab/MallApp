package com.ecodes.mallapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.ImageView

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val splashLogo: ImageView = findViewById((R.id.splash_logo))
        // This is used to hide the status bar and make the splash screen as a full screen activity.
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )


        // Adding the handler to after the a task after some delay.
        Handler().postDelayed({

            splashLogo.setImageResource(R.drawable.mall_logo)

            // Start the Main Activity
            startActivity(Intent(this, UserVendorActivity::class.java))
            finish() // Call this when your activity is done and should be closed.
        }, 2500) // Here we pass the delay time in milliSeconds after which the splash activity will disappear.
    }
}