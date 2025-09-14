package com.arsipu.intentbuildertest

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.arsipu.intentbuilder.IntentBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnIntent = findViewById<android.widget.Button>(R.id.btnToNextActivity)
        btnIntent.setOnClickListener {
            IntentBuilder.goIntent(this, SecondActivity())
        }

        val btnIntentWithExtra =
            findViewById<android.widget.Button>(R.id.btnToNextActivityWithExtra)
        btnIntentWithExtra.setOnClickListener {
            val intent = IntentBuilder(this, SecondActivity())
                .setStringExtra(SecondActivity.EXTRA_TEXT, "Hello from MainActivity")
                .setFlags(android.content.Intent.FLAG_ACTIVITY_NEW_TASK)
                .build()

            IntentBuilder.goIntent(this, intent)
        }
    }
}