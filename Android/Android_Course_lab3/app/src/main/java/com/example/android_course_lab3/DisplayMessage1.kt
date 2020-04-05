package com.example.android_course_lab3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessage1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message1)

        val message = intent.getStringExtra(EXTRA_MESSAGE)

        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }
        val textView2 = findViewById<TextView>(R.id.textView2).apply {
            text = message
        }
        val textView3 = findViewById<TextView>(R.id.textView3).apply {
            text = message
        }
    }
}
