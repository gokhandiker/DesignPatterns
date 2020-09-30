package com.gkhn.designpatterns.structural.adapter.example3

import kotlin.math.pow

class SquarePeg(private val width: Double) {


    fun getWidth(): Double = this.width

    fun getSquare(): Double = this.width.pow(2.0)

}