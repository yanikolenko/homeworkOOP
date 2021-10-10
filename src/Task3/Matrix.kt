package Task3

class Matrix(var rows:Int, var columns:Int) {

    var arr = Array<Array<Int>>(rows){
        i ->
            Array<Int>(columns){
                j -> j
            }
    }

    fun amount(matrix:Array<Array<Int>>):Array<Array<Int>>{

        for (i in 0..columns - 1){
           for (j in 0..rows - 1){
                matrix[i][j] += arr[i][j]
           }
        }
        return matrix
    }

    fun mult(number:Int):Array<Array<Int>>{
        for (i in 0..columns - 1){
            for (j in 0..rows - 1){
                arr[i][j] *= number
            }
        }
        return arr
    }

    fun prin() {
        for (i in arr) {
            for (j in i) {
                print(j)
            }
            println()
        }

    }

    fun matrixMultMatr(matrix:Array<Array<Int>>):Array<Array<Int>>{

        for (i in 0..columns - 1){
            for (j in 0..rows - 1){
                matrix[i][j] *= arr[i][j]
            }
        }
        return matrix
    }
}