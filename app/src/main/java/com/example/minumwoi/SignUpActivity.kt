package com.example.minumwoi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btnDaftar = findViewById<Button>(R.id.btnDaftar)
        val btnsignin = findViewById<Button>(R.id.btnsignin)

        btnDaftar.setOnClickListener {
            val intent = Intent(this, KelaminActivity::class.java)
            startActivity(intent)
        }

        btnsignin.setOnClickListener {
            val intent = Intent(this, BerandaActivity::class.java)
            startActivity(intent)
        }
    }
}
