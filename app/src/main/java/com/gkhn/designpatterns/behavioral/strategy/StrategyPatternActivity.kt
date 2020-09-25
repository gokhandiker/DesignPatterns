package com.gkhn.designpatterns.behavioral.strategy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.gkhn.designpatterns.R
import com.gkhn.designpatterns.behavioral.strategy.example1.Brake
import com.gkhn.designpatterns.behavioral.strategy.example1.SUV
import com.gkhn.designpatterns.behavioral.strategy.example1.Sedan
import com.gkhn.designpatterns.behavioral.strategy.example2.Calculation
import com.gkhn.designpatterns.behavioral.strategy.example2.OperationMultiply

class StrategyPatternActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_strategy_pattern)


        // Example1
        var sedanCar : Sedan = Sedan()
        sedanCar.applyBrake()

        var suvCar : SUV = SUV()
        suvCar.applyBrake()

        suvCar.setBrakeBehavior(Brake())
        suvCar.applyBrake()


        // Example2
        var calculation : Calculation = Calculation()
        Log.e("calculation", calculation.calculate(4,5).toString())
        calculation.changeStrategy(OperationMultiply())
        Log.e("calculation", calculation.calculate(4,5).toString())

    }
}