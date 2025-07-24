package com.example.minumwoi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.view.inputmethod.EditorInfo
import android.widget.EditText


class BangunActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bangun)

        val bangun = findViewById<EditText>(R.id.Bangun)

        bangun.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                val intent = Intent(this, TidurActivity::class.java)
                startActivity(intent)
                true
            } else {
                false
            }
        }
    }

}