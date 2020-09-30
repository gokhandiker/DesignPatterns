package com.gkhn.designpatterns.structural.adapter.example2

class IPhone : LightningPhone {

    private var connector : Boolean =false

    override fun reCharge() {
        if (connector) {
            println("Recharge started")
            println("Recharge finished")
            connector = false
        } else {
            println("Connect lightning first!")
        }
    }

    override fun useLightning() {
        connector = true
        println("Lightning connected!")
    }
}