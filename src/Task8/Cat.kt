package Task8

class Cat(food: String, location:String, val meow:String) :Animal(food, location) {
    override fun makeNoise() {
        println("Кіт гавкає")
    }

    override fun eat() {
        println("Кіт їсть")
    }

    override fun sleep() {
        println("Кіт спить")
    }
}