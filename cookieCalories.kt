fun main() {
    val cookiesPerBag = 40
    val servingsPerBag = 10
    val caloriesPerServing = 300

    print("Enter number of cookies eaten: ")
    val cookiesEaten = readLine()?.toIntOrNull() ?: 0

    val totalServings = cookiesEaten.toDouble() / cookiesPerBag * servingsPerBag
    val totalCalories = (totalServings * caloriesPerServing).toInt()

    println("Your calorie intake was: $totalCalories calories.")
}
