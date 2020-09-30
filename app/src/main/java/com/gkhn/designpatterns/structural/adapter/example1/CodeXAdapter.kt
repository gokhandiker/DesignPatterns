package com.gkhn.designpatterns.structural.adapter.example1

class CodeXAdapter(private val codeX: CodeX) : Crypt {


    override fun encrypt(text: String) {
        this.codeX.textToCode(text)
    }

    override fun decrypt(text: String) {
        this.codeX.codeToText(text)
    }
}