package com.gkhn.designpatterns.structural

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gkhn.designpatterns.R
import com.gkhn.designpatterns.structural.decorator.example1.Coffee
import com.gkhn.designpatterns.structural.decorator.example1.SimpleCoffee
import com.gkhn.designpatterns.structural.decorator.example1.WithMilk
import com.gkhn.designpatterns.structural.decorator.example1.WithSprinkles
import com.gkhn.designpatterns.structural.decorator.example2.*

class StructuralActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_structural)
        runDecoratorExample2()

    }

    fun runDecoratorExample1() {
        var coffee : Coffee = SimpleCoffee()
        println("Simple coffe price: "+coffee.getCost())

        coffee = WithMilk(coffee)

        println("Simple coffe price with milk: "+coffee.getCost())

        coffee = WithSprinkles(coffee)

        println("Simple coffe price with sprinkles: "+coffee.getCost())
    }

    fun runDecoratorExample2() {
      var a : I = A()
        a.doIt()
        println("------------")
        a = X(a)
        a.doIt()
        println("------------")

        a = Y(a)
        a.doIt()
        println("------------")

        a = Z(a)
        a.doIt()
    }
}