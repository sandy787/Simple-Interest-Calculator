package com.example.sinterestcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sinterestcalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.calculate.setOnClickListener {
            val principal = binding.Principal.text.toString().toDoubleOrNull() ?: 0.0
            val interest = binding.Interest.text.toString().toDoubleOrNull() ?: 0.0
            val time = binding.Time.text.toString().toDoubleOrNull() ?: 0.0

            val result=((principal*interest*time)/100).toString()
            binding.textView3.text=result

        }

        binding.reset.setOnClickListener {
            binding.Principal.text = null
            binding.Interest.text=null
            binding.Time.text=null
            binding.textView3.text=null
        }

    }
}