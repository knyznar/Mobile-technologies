package com.example.android_course_lab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submitButton = findViewById<Button>(R.id.btnSubmit)
        val editText = findViewById<EditText>(R.id.etInsertHello)

        submitButton.setOnClickListener{
            val inputText = editText.text
            val intent = Intent(this, AnotherActivity::class.java).apply {
                putExtra("input", inputText.toString())
            }
            startActivity(intent)
        }
    }
}
