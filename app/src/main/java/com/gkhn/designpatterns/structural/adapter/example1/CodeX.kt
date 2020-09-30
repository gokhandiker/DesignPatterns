package com.gkhn.designpatterns.structural.adapter.example1

class CodeX {

    fun textToCode(text: String) {
        println("$text encrypted with CodeX!")
    }

    fun codeToText(text: String) {
        println("$text encrypted with CodeX!")
    }
}