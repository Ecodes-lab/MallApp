package com.ecodes.mallapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUpActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btnSignup: Button = findViewById(R.id.btn_signup)
        val btnLoginNowNav: Button = findViewById(R.id.btn_login_now_nav)

        btnSignup.setOnClickListener {
            startActivity(Intent(this, SuccessScreenActivity::class.java))
            finish()
        }

        btnLoginNowNav.setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
        }
    }
}