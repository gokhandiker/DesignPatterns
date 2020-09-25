package com.gkhn.designpatterns.behavioral.strategy.example1

import android.util.Log

class Brake : IBrakeBehavior {
    override fun brake() {
        Log.e("BrakeBehavior: ","Simple Brake applied")
    }
}