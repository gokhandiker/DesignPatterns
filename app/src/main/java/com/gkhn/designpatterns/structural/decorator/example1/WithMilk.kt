package com.gkhn.designpatterns.structural.decorator.example1

class WithMilk(coffee : Coffee) : CoffeeDecorator(coffee) {

    override fun getCost(): Double {
        return super.getCost() + 0.5
    }

    override fun getIngredients(): String {
        return super.getIngredients() + ", Milk"
    }
}