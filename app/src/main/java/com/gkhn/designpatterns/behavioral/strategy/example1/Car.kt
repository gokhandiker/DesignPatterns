package com.gkhn.designpatterns.behavioral.strategy.example1

abstract class Car(private var brakeBehavior: IBrakeBehavior) {

    fun applyBrake() {
        brakeBehavior.brake()
    }

    fun setBrakeBehavior(_brakeBehavior: IBrakeBehavior) {
        this.brakeBehavior = _brakeBehavior
    }
}