fun main(args: Array<String>) {
    println("Hello World")
    println("My first Kotlin program")

    var tim: String
    tim = "Tim Buchalka"
    println(tim)

    var timsWeeklySalary: Int = 32
    var timsMonthlySalary: Int = timsWeeklySalary * 4
    println(timsWeeklySalary)
    println(timsMonthlySalary)

    println()

    val apples: Int = 6
    val oranges: Int = 5
    var fruit: Int = apples - oranges
    println(fruit)

    println(apples / 4)

    println()
    val weeks: Int = 130
    val years: Double = weeks / 52.0
    println(years)
}