package com.example.minumwoi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.view.inputmethod.EditorInfo
import android.widget.EditText


class BeratActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_berat)

        val berat = findViewById<EditText>(R.id.berat)

        berat.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                val intent = Intent(this, BangunActivity::class.java)
                startActivity(intent)
                true
            } else {
                false
            }
        }
    }
}