package com.gkhn.designpatterns.structural.adapter.example3

class SquarePegAdapter(private val peg: SquarePeg) : RoundPeg() {


    override fun getRadius(): Double? {
        return (Math.sqrt(Math.pow((peg.getWidth() / 2), 2.0) * 2))
    }

}