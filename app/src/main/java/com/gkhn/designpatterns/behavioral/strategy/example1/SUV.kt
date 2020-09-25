package com.gkhn.designpatterns.behavioral.strategy.example1

class SUV(_brakeBehavior : IBrakeBehavior = ABSBrake()) : Car(_brakeBehavior)