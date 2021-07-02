package one.digitalinnovation.collection

fun main() {
    // Inicializando array de string vazia
    val nomes = Array(3) {""}

    nomes[0] = "Kotlin"
    nomes[1] = "IDE"
    nomes[2] = "Programming"

    println("\nValues of array: \n")
    for (nome in nomes){
        println(" - $nome")
    }

    println("\nOrdering Values of array: \n")
    nomes.sort()
    nomes.forEach {
        println(" - $it")
    }

    val string_values = arrayOf("Val", "Val2", "Val3", "Val10")
    println("\nValues of string array: \n")
    for (str in string_values){
        println(" - $str")
    }
}
