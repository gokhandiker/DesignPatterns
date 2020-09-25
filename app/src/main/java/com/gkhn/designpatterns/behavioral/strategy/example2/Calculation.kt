package com.gkhn.designpatterns.behavioral.strategy.example2

class Calculation(var strategy: Strategy = OperationAdd()) {

    fun calculate(num1: Int, num2: Int) : Int{
      return  strategy.doOperation(num1, num2)
    }

    fun changeStrategy(_strategy: Strategy) {
        this.strategy = _strategy
    }
}