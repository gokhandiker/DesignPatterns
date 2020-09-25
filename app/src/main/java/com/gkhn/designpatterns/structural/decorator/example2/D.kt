package com.gkhn.designpatterns.structural.decorator.example2

abstract class D(val core : I) : I {

    override fun doIt() {
        core.doIt()
    }
}