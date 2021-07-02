package one.digitalinnovation.collection

fun lines(){
    println("\n-------------------\n")
}

fun main() {
    // Inicializando array
    val values = IntArray(5)

    values[0] = 11
    values[1] = 4
    values[2] = 6
    values[3] = 8
    values[4] = 5

    lines()
    for (valor in values){
        println(valor)
    }

    lines()
    values.forEach {
        println(it)
    }

    lines()
    // Ordenando array
    values.sort()
    values.forEach {
        println(it)
    }
}