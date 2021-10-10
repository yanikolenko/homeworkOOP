package Task11

class Rectangle(color:String, val coordX:MutableList<Int>, val coordY:MutableList<Int>):Shape(color) {

    override fun draw() {
        var i = 0
        while (i < coordX.size-1){
            println("(${coordX[i]}, ${coordY[i]})")
            i++
        }
    }

    override fun equals() {

    }
}