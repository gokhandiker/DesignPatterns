package com.gkhn.designpatterns.behavioral.strategy.example1

class Sedan(_brakeBehavior : IBrakeBehavior = Brake()) : Car(_brakeBehavior) {


}