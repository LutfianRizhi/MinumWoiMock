package com.example.minumwoi

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.enableEdgeToEdge

class KelaminActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_kelamin)

        val btnPria = findViewById<ImageButton>(R.id.btnPria)
        val btnWanita = findViewById<ImageButton>(R.id.btnWanita)

        btnPria.setOnClickListener {
            val intent = Intent(this, BeratActivity::class.java)
            intent.putExtra("gender", "pria")
            startActivity(intent)
        }

        btnWanita.setOnClickListener {
            val intent = Intent(this, BeratActivity::class.java)
            intent.putExtra("gender", "wanita")
            startActivity(intent)
        }
    }
}
