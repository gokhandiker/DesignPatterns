package com.gkhn.designpatterns.structural

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gkhn.designpatterns.R
import com.gkhn.designpatterns.structural.adapter.example1.*
import com.gkhn.designpatterns.structural.adapter.example2.*
import com.gkhn.designpatterns.structural.adapter.example3.RoundHole
import com.gkhn.designpatterns.structural.adapter.example3.RoundPeg
import com.gkhn.designpatterns.structural.adapter.example3.SquarePeg
import com.gkhn.designpatterns.structural.adapter.example3.SquarePegAdapter
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

        runAdapterExample1()

        runAdapterExample2()

        runAdapterExample3()
    }


    private fun runAdapterExample3() {
        // Round fits round, no surprise.

        // Round fits round, no surprise.
        val hole = RoundHole(5.0)
        val rpeg = RoundPeg(5.0)
        if (hole.fits(rpeg)) {
            println("Round peg r5 fits round hole r5.")
        }

        val smallSqPeg = SquarePeg(2.0)
        val largeSqPeg = SquarePeg(20.0)
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        val smallSqPegAdapter = SquarePegAdapter(smallSqPeg)
        val largeSqPegAdapter = SquarePegAdapter(largeSqPeg)
        if (hole.fits(smallSqPegAdapter)) {
            println("Square peg w2 fits round hole r5.")
        }
        if (!hole.fits(largeSqPegAdapter)) {
            println("Square peg w20 does not fit into round hole r5.")
        }
    }
    fun runAdapterExample2() {
        var iPhone1: IPhone = IPhone()
        var android: Android = Android()
        var iPhone2: IPhone = IPhone()

        AdapterDemo.rechargeLightningPhone(iPhone1)

        AdapterDemo.rechargeMicroUsbPhone(android)

        AdapterDemo.rechargeMicroUsbPhone(LightningToMicroUsbAdapter(iPhone2))

    }

    class AdapterDemo {
        companion object {
            fun rechargeMicroUsbPhone(phone: MicroUsbPhone) {
                phone.useMicroUsb()
                phone.reCharge()
            }

            fun rechargeLightningPhone(phone: LightningPhone) {
                phone.useLightning()
                phone.reCharge()
            }
        }
    }

    fun runAdapterExample1() {
        var cryptA: Crypt = CryptA()
        cryptA.encrypt("Hasan")
        cryptA.decrypt("deHasan")

        var cryptB: Crypt = CryptB()
        cryptB.encrypt("Veli")
        cryptB.decrypt("deVeli")

        var codeX = CodeX()

        var cryptX: Crypt = CodeXAdapter(codeX)

        cryptX.encrypt("Ahmet")
        cryptX.decrypt("deAhmet")
    }

    fun runDecoratorExample1() {
        var coffee: Coffee = SimpleCoffee()
        println("Simple coffe price: " + coffee.getCost())

        coffee = WithMilk(coffee)

        println("Simple coffe price with milk: " + coffee.getCost())

        coffee = WithSprinkles(coffee)

        println("Simple coffe price with sprinkles: " + coffee.getCost())
    }

    fun runDecoratorExample2() {
        var a: I = A()
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