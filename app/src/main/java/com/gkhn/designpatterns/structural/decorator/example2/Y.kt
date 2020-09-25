package com.gkhn.designpatterns.structural.decorator.example2

class Y(core: I) : D(core) {
    override fun doIt() {
        super.doIt()
        doY()
    }

    private fun doY() {
        println("Y")
    }
}