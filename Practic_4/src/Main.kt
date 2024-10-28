fun printFullName(firstName:String, lastName:String) {
    println(firstName + " " + lastName)
}
fun calculateFullName(firstName:String, lastName:String): String {
    return "$firstName $lastName"
}
fun calculateFullNameWithLength(firstName: String, lastName: String): Pair<String, Int> {
    val fullName = "$firstName $lastName"
    return Pair(fullName, fullName.length)
}
fun main() {
    //1
    printFullName("Alina","Kharitonova")

    //2
    printFullName(firstName = "Arina", lastName = "Kharitonova")

    //3
    val fullName = calculateFullName("Julia","Kharitonova")
    println(fullName)

    //4
    val (fullName1, length) = calculateFullNameWithLength("Masha", "Petrova")
    println("Полное имя: $fullName1")
    println("Длина полного имени: $length")

    //5

}