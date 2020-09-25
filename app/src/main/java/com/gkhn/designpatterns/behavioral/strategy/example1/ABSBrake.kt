package com.gkhn.designpatterns.behavioral.strategy.example1

import android.util.Log

class ABSBrake : IBrakeBehavior {
    override fun brake() {
        Log.e("BrakeBehavior: ","Brake with ABS applied")
    }
}