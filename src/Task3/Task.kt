package Task3

fun main() {
    val matrix = Matrix(3, 3)

    var arr1 = Array<Array<Int>>(3){
            i ->
        Array<Int>(3){
                j -> j
        }
    }

    arr1 = matrix.mult(3)

    for (i in arr1){
        for (j in i){
            print(j)
        }
        println()
    }



}