package Task1

class Phone(var number:Int = 0, var model:String = "") {
    var weight = 0f


    fun receiveCall(name:String){
        println("Телефонує $name")
    }

    fun receiveCall(name:String, number: Int){
        this.number = number
        println("Телефонує $name, $number")
    }

    fun getNumber(): Int? {
        return number
    }

    constructor(number: Int, model: String, weight:Float): this(){

    }
}