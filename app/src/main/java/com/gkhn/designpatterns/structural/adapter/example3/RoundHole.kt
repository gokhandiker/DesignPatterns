package com.gkhn.designpatterns.structural.adapter.example3

import com.gkhn.designpatterns.structural.adapter.example3.RoundPeg

class RoundHole(private val radius: Double) {
    fun getRadius(): Double = this.radius

    fun fits(peg: RoundPeg) = (this.getRadius() >= peg.getRadius()!!)
}