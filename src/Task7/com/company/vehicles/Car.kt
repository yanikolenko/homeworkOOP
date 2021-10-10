package Task7.com.company.vehicles

import Task7.com.company.details.Engine
import Task7.com.company.professions.Driver

open class Car(val mark:String, val classCar:String, val weight:Double, val driver: Driver, val motor:Engine):Driver("Yaroslav", 12) {

    fun start(){
        println("Поїхали")
    }

    fun stop(){
        println("Стоп")
    }

    fun turnRight(){
        println("Поверніть праворуч")
    }

    fun turnLeft(){
        println("Поверніть ліворуч")
    }

    fun toString1(){
        println("-------------")
        println("Info:")
        println("1) $mark")
        println("2) $classCar")
        println("3) $weight")
        println("4) ${driver.experience}")
        println("5) ${driver.fullName}")
        println("6) ${motor.power}")
        println("7) ${motor.creator}")
        println("-------------")
    }

}