package one.digitalinnovation.collection

fun main() {
    val values = intArrayOf(2, 4, 1, 10, 41)

    println("Values of array: \n")
    values.forEach{
        println("Value: $it")
    }

    println("\nOrdering values of array: \n")
    values.sort()
    values.forEach{
        println("Value: $it")
    }
}