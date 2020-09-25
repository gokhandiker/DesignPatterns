package com.gkhn.designpatterns.structural.decorator.example1

class SimpleCoffee : Coffee {
    override fun getCost(): Double {
        return 1.0
    }

    override fun getIngredients(): String {
        return "Coffee"
    }
}