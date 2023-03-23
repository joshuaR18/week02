fun main() {
    val n = 4 
    for (i in 1..n) {
        for (j in 1..n-i+1) {
            print(" ")
        }
        for (j in 1..2*i-1) {
            print("*")
        }
        println()
    }
    println("*********")
    for (i in n downTo 1) {
        for (j in 1..n-i+1) {
            print(" ")
        }
        for (j in 1..2*i-1) {
            print("*")
        }
        println()
    }
}




