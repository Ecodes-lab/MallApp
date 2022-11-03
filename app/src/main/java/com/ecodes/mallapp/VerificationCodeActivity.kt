package com.ecodes.mallapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class VerificationCodeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification_code)

        val btnForgotPWContinue: Button = findViewById(R.id.btn_forgot_pw_continue)

        btnForgotPWContinue.setOnClickListener {
            startActivity(Intent(this, ResetPasswordActivity::class.java))
        }
    }
}