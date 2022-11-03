package com.ecodes.mallapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ForgotPasswordActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val btnForgotPWContinue: Button = findViewById(R.id.btn_forgot_pw_continue)

        btnForgotPWContinue.setOnClickListener {
            startActivity(Intent(this, VerificationCodeActivity::class.java))
        }
    }
}