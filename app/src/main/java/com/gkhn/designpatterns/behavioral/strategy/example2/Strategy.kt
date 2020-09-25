package com.gkhn.designpatterns.behavioral.strategy.example2

interface Strategy {
    fun doOperation(num1: Int, num2: Int): Int
}