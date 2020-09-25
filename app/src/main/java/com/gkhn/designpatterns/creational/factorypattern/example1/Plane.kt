package com.gkhn.designpatterns.creational.factorypattern.example1

import android.util.Log

class Plane : Transport {
    override fun deliver() {
        Log.e("Truck","Delivered by Plane")
    }
}