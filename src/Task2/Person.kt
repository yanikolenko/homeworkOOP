package Task2

class Person(var fullName:String="", var age:Int=0) {
    fun move(){
        println("$fullName рухається")
    }

    fun talk(){
        println("$fullName говорить")
    }
}