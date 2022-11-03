package com.ecodes.mallapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class SignInActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val btnSignin: Button = findViewById(R.id.btn_signin)
        val btnForgotPassNav: Button = findViewById(R.id.btn_forgot_pw_nav)
        val btnRegNowNav: Button = findViewById(R.id.btn_register_now_nav)
        val btnBack: ImageView = findViewById(R.id.btn_back)

        btnBack.setOnClickListener {
//            val navcon = this.findNavController(R.id.NavFragment)

        }

        btnSignin.setOnClickListener {
            startActivity(Intent(this, SuccessScreenActivity::class.java))
            finish()
        }

        btnForgotPassNav.setOnClickListener {
            startActivity(Intent(this, ForgotPasswordActivity::class.java))
        }

        btnRegNowNav.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}