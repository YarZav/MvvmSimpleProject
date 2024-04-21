package com.example.mvvmsimpleproject.viewmodel

import androidx.lifecycle.ViewModel
import com.example.mvvmsimpleproject.model.CalculatorData

class CalculatorViewModel: ViewModel() {
    fun calculateSum(num1: Int, num2: Int): CalculatorData {
        val sum = num1 + num2
        val model = CalculatorData(num1, num2, sum)
        return model
    }
}