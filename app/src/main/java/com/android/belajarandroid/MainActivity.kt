package com.android.belajarandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.android.belajarandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var dataBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)

        dataBinding.apply {
            button.setOnClickListener {
                val text: String? = inputText.text.toString()
                when (text?.trim()) {
                    null -> {
                        textView.text = "Hello, World!"
                        Toast.makeText(this@MainActivity, "Hello, World!", Toast.LENGTH_SHORT)
                            .show()
                        gambar.setImageResource(resources.getIdentifier("naruto", "drawable", packageName))
                    }
                    "" -> {
                        textView.text = "Tidak boleh kosong!"
                        Toast.makeText(this@MainActivity, "Tidak boleh kosong!", Toast.LENGTH_SHORT)
                            .show()
                        gambar.setImageResource(resources.getIdentifier("naruto", "drawable", packageName))
                    }
                    else -> {
                        textView.text = text
                        Toast.makeText(this@MainActivity, text, Toast.LENGTH_SHORT)
                            .show()
                        gambar.setImageResource(resources.getIdentifier(text, "drawable", packageName))
                    }
                }
            }
        }
    }
}
