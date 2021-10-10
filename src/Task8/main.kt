package Task8

import java.util.*

fun main() {
    val cat = Cat("fish", "home", "meow!")
    val dog = Dog("meat", "home", "Gav!!!")
    val horse = Horse("plants", "home", "Igogo")

    val veterinar = Veterinar()

    veterinar.treatAnimal(cat)
    veterinar.treatAnimal(dog)
    veterinar.treatAnimal(horse)

    var arr: Array<Animal> = arrayOf(cat, dog, horse)

    for (i in 0..arr.size-1){
        veterinar.treatAnimal(arr[i])
    }
}