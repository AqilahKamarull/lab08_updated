package com.example.lab08_updated

import android.os.Bundle
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    val pizzaSizes = arrayOf("Please Select Size","Small", "Medium", "Large", "Extra Large")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        binding.nameTextView.text = intent.getStringExtra("name")
        binding.phoneTextView.text = intent.getStringExtra("phone")

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.sizeSeekBar.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                binding.sizeTextView.text = pizzaSizes[progress]
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                binding.sizeTextView.text = "Seekbar mula ditekan"
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        }

        }


















        binding.sizeSeekBar
    }
}