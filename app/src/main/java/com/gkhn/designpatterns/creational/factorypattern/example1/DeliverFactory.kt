package com.gkhn.designpatterns.creational.factorypattern.example1

import java.lang.Exception

class DeliverFactory {

    public fun getTransport(_type : DeliverType): Transport {
        return when (_type) {
            DeliverType.AIR -> Plane()
            DeliverType.GROUND -> Truck()
            DeliverType.SEA -> Ship()
        }
    }
}