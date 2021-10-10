package Task6

open class Student(val firstName:String = "", val lastName:String = "", val group:String="", var averageMark:Double=0.0) {

    open fun getScholarship():Int{
        return if (averageMark == 5.0){
            100
        }else{
            80
        }
    }
}