package com.gkhn.designpatterns.structural.adapter.example1

class CryptB : Crypt {
    override fun encrypt(text: String) {
        println("$text encrypted with CryptB!")
    }

    override fun decrypt(text: String) {
        println("$text encrypted with CryptB!")
    }
}