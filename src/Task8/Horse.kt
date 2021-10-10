package Task8

class Horse(food: String, location:String, val sit:String) :Animal(food, location) {
    override fun makeNoise() {
        println("Кінь гавкає")
    }

    override fun eat() {
        println("Кінь їсть")
    }

    override fun sleep() {
        println("Кінь спить")
    }
}