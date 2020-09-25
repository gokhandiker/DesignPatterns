package com.gkhn.designpatterns.structural.decorator.example2

class Z(core: I) : D(core) {
    override fun doIt() {
        super.doIt()
        doZ()
    }

    private fun doZ() {
        println("Z")
    }
}