package Task8

class Dog(food: String, location:String, val bark:String) :Animal(food, location) {
    override fun makeNoise() {
        println("Собака гавкає")
    }

    override fun eat() {
        println("Собака їсть")
    }

    override fun sleep() {
        println("Собака спить")
    }
}