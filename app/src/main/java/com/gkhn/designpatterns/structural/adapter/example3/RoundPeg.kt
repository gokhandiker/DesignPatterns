package com.gkhn.designpatterns.structural.adapter.example3

open class RoundPeg(private val radius: Double? = null) {


    open fun getRadius() = this.radius
}