package Task11

import java.util.*

fun main() {
    val arrX = mutableListOf<Int>(1,2,3,4,5,6)
    val arrY = mutableListOf<Int>(1,2,3,4,5,6)

    val circle = Circle("red", arrX, arrY)
    val rectangle = Rectangle("blue", arrX, arrY)


    val arr: Array<Shape> = arrayOf(circle, rectangle)

    for (i in arr){
        i.draw()
    }

}