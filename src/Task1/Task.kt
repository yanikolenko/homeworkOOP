package Task1

fun main() {
    val phone1 = Phone(2, "Pixel", 180f)
    val phone2 = Phone(3, "Pixel", 185f)
    val phone3 = Phone(4, "Pixel", 190f)

    phone1.getNumber()
    phone1.receiveCall("Yarik")
    phone1.receiveCall("Yarik", 63444)

    phone2.getNumber()
    phone1.receiveCall("Yarik")
    phone2.receiveCall("Yarik", 564565)

    phone3.getNumber()
    phone3.receiveCall("Yarik")
    phone3.receiveCall("Yarik", 7777)

    println(phone1.model + " " +  phone1.number + " " +  phone1.weight + " g")
    println(phone2.model + " " + phone2.number + " " + phone2.weight + " g")
    println(phone3.model + " " + phone3.number + " " + phone3.weight + " g")
}