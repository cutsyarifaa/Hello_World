package com.d3if4012.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickButton: Button = findViewById(R.id.click_btn)
        clickButton.setOnClickListener {
            helloText()
        }
    }

    private fun helloText() {
        val resultText: TextView = findViewById(R.id.click_txt)
        resultText.text = "Hello World!"
    }
}
