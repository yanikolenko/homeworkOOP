package Task5

fun main() {
    val writeNumbers = WriteNumbers(1, 9)
    writeNumbers.writeN()
}

class WriteNumbers(var firstNumber:Int, var secondNumber:Int){
    var flag = true
    fun writeN(){
        if (firstNumber <= secondNumber && flag){
            println(firstNumber)
            firstNumber++
            if (firstNumber == secondNumber){
                println(firstNumber)
                flag = false
            }
            writeN()
        }else if (firstNumber >= secondNumber  && flag){
            println(firstNumber)
            firstNumber--
            if (firstNumber == secondNumber){
                println(firstNumber)
                flag = false
            }
            writeN()
        }
    }
}