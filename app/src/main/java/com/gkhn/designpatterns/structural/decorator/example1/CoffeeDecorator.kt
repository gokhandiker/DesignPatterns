package com.gkhn.designpatterns.structural.decorator.example1

abstract class CoffeeDecorator(val decoratedCoffee: Coffee) : Coffee {

    override fun getCost(): Double {
       return decoratedCoffee.getCost()
    }

    override fun getIngredients(): String {
        return decoratedCoffee.getIngredients()
    }
}