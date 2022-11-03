package com.ecodes.mallapp

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class UserVendorActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_vendor)



        val btnUser: Button = findViewById(R.id.btn_user)

        val btnVendor: Button = findViewById(R.id.btn_vendor)

        btnVendor.setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
        }
//
//        val paint = btnUser.paint
//        val width = paint.measureText(btnUser.toString())
//        val textShader: Shader = LinearGradient(0f, 0f, width, btnUser, intArrayOf(
//            Color.parseColor("#91AAFF"),
//            Color.parseColor("#3752D7"),
//            /*Color.parseColor("#64B678"),
//            Color.parseColor("#478AEA"),*/
////            Color.parseColor("#FFFFFF")
//        ), null, Shader.TileMode.REPEAT)
//
//        btnUser.paint.setShader(textShader)
    }
}