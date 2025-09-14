package com.arsipu.intentbuildertest

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val text = intent.getStringExtra(EXTRA_TEXT)
        val textView = findViewById<android.widget.TextView>(R.id.textView)

        if (text == null) {
            textView.text = "Second Activity (no extra text)"
        } else {
            textView.text = text
        }
    }

    companion object {
        const val EXTRA_TEXT = "extra_text"
    }
}