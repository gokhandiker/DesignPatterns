package com.gkhn.designpatterns.structural.decorator.example1

class WithSprinkles(coffee: Coffee) : CoffeeDecorator(coffee) {
    override fun getCost(): Double {
        return super.getCost() + 0.2
    }

    override fun getIngredients(): String {
        return super.getIngredients() + ", Sprinkles"
    }
}