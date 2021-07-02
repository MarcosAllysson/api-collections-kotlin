package one.digitalinnovation.collection

fun main() {
    val salarios = doubleArrayOf(1234.1, 4323.6, 7632.0)

    println("\nSALÁRIOS")
    for (salario in salarios){
        println(salario)
    }

    println("\nMAIOR SALÁRIO")
    println("R$ ${salarios.maxOrNull()}")

    println("\nMENOR SALÁRIO")
    println("R$ ${salarios.minOrNull()}")

    println("\nMÉDIA SALARIAL")
    println("R$ ${salarios.average()}")

    // Filtrando
    println("\nSALÁRIOS MAIORES QUE R$ 2500,00")
    val salarioFilter = salarios.filter{
        it > 2500.0
    }
    for (d in salarioFilter) {
        println("R$ $d")
    }

    println("\nSALÁRIOS ENTRE R$ 2.000,00 E R$ 5.000,00")
    println(salarios.count { it in 2000.0..5000.0 })

    println("\nSALÁRIOS IGUAL A R$ 7.632,00")
    println(salarios.find { it == 7632.0 })

    println("\nSE SALÁRIO R$ 1.234,10 CONSTA")
    println(salarios.any { it == 1234.1 })
}
