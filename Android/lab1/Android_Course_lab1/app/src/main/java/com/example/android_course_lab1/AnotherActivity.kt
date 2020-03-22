package com.example.android_course_lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AnotherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)

        val tvInput = findViewById<TextView>(R.id.tvInput)

        val message = intent.getStringExtra("input")
        print(message)
        tvInput.text = message
    }
}
