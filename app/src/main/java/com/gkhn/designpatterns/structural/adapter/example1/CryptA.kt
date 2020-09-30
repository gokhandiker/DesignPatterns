package com.gkhn.designpatterns.structural.adapter.example1

class CryptA : Crypt {
    override fun encrypt(text: String) {
        println("$text encrypted with CryptA!")
    }

    override fun decrypt(text: String) {
        println("$text decrypted with CryptA!")
    }
}