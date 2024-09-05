package com.example.solotrekkers

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class VerifyEmailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_verify_email)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.verifyEmailPage)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val verifyEmailBtn = findViewById<Button>(R.id.verifyEmailButton)
        verifyEmailBtn.setOnClickListener {
            val intent = Intent(this, CreateNewPassword::class.java)
            startActivity(intent)
        }
    }
}