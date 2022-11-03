package com.ecodes.mallapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ResetPasswordActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)

        val btnResetPw: Button = findViewById(R.id.btn_reset_password)

        btnResetPw.setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
        }
    }
}