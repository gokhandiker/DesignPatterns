package com.gkhn.designpatterns.structural.adapter.example1

interface Crypt {
    fun encrypt(text: String)
    fun decrypt(text: String)
}