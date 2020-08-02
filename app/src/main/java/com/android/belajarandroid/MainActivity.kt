package com.android.belajarandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val text: String? = inputText.text.toString()
            when (text?.trim()) {
                null -> {
                    textView.text = "Hello, World!"
                    Toast.makeText(this@MainActivity, "Hello, World!", Toast.LENGTH_SHORT)
                        .show()
                }
                "" -> {
                    textView.text = "Hello, World!"
                    Toast.makeText(this@MainActivity, "Hello, World!", Toast.LENGTH_SHORT)
                        .show()
                }
                else -> {
                    textView.text = text
                    Toast.makeText(this@MainActivity, text, Toast.LENGTH_SHORT)
                        .show()
                }
            }
        }
    }
}
