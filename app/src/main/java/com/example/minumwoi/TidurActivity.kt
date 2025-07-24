package com.example.minumwoi

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class TidurActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tidur)

        // Ambil referensi ke EditText dengan id "Tidur"
        val jamTidurEditText = findViewById<EditText>(R.id.Tidur)

        // Ambil nilai teks (kalau perlu)
        val jamTidur = jamTidurEditText.text.toString()

        // Contoh: print log untuk cek nilai
        println("Jam tidur yang dimasukkan: $jamTidur")
    }
}
