package com.gkhn.designpatterns.creational.factorypattern.example2

class PersonFactory  {

    fun getPerson(_type : PersonType): IPerson {
        return when (_type) {
            PersonType.CITY -> CityPerson()
            PersonType.VILLAGE -> Villager()
        }
    }
}