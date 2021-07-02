package one.digitalinnovation.collection

fun main() {
    val salarios = DoubleArray(3)

    salarios[0] = 1000.0
    salarios[1] = 2000.0
    salarios[2] = 3000.0

    salarios.forEach {
        println("Salário: R$ $it")
    }

    println("\nCom aumento de 10%")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach {
        println("Salário: R$ $it")
    }
}