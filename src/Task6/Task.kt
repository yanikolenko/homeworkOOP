package Task6

fun main() {
    val student = Student("Yaroslav", "Nikolenko", "Scientist", 5.0)
    println(student.getScholarship())
    val aspirant = Aspirant()
    println(aspirant.getScholarship())

    val asp1:Student = Aspirant()

    val list1 = mutableListOf<Student>()
    list1.add(aspirant)
    list1.add(student)

    list1[0].getScholarship()
    list1[1].getScholarship()
}