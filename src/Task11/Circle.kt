package Task11

class Circle(color:String, val coordX:MutableList<Int>, val coordY:MutableList<Int>):Shape(color) {
    override fun draw() {

    }

    override fun equals() {
        var i = 0
        while (i < coordX.size-1){
            println("(${coordX[i]}, ${coordY[i]})")
            i++
        }
    }
}