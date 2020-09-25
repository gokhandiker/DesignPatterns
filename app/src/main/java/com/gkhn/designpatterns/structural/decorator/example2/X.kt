package com.gkhn.designpatterns.structural.decorator.example2

class X(core: I) : D(core) {
    override fun doIt() {
        super.doIt()
        doX()
    }

    private fun doX() {
        println("X")
    }
}