package Task6

class Aspirant: Student() {

    override
    fun getScholarship():Int{
        return if (averageMark == 5.0){
            200
        }else{
            180
        }
    }
}