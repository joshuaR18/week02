import kotlin.math.pow

fun main() {
    print("Enter the principal amount: ")
    val principal: Double = readLine()!!.toDouble()

    print("Enter the annual interest rate: ")
    val rate: Double = readLine()!!.toDouble()

    print("Enter the number of times per year the interest is compounded: ")
    val compounded: Int = readLine()!!.toInt()

    print("Enter the number of years the account will earn interest: ")
    val years: Int = readLine()!!.toInt()

    val amount = principal * (1 + rate / compounded).pow(compounded * years)

    
    println("The amount of money in the account after $years years is: $amount")
}
