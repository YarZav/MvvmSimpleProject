package com.example.mvvmsimpleproject.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmsimpleproject.databinding.ActivityMainBinding
import com.example.mvvmsimpleproject.viewmodel.CalculatorViewModel

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: CalculatorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(CalculatorViewModel::class.java)

        binding.calculateButton.setOnClickListener {
            val num1 = binding.editTextNum1.text.toString().toIntOrNull() ?: 0
            val num2 = binding.editTextNum2.text.toString().toIntOrNull() ?: 0

            val result = viewModel.calculateSum(num1, num2)
            binding.resultTextView.text = "${result.sum}"
        }
    }
}