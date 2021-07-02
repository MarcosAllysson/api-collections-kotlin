package one.digitalinnovation.collection

fun main() {
    val salario = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "2435".toBigDecimal(),
        "1987".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println("Somatória")
    println(salario.somatoria())

    println("\nMédia")
    println(salario.media())
}