package one.digitalinnovation.collection

fun main() {
    val pair: Pair<String, Double> = Pair("João", 2000.0)
    val map1 = mapOf(pair)

    map1.forEach { (key, value) ->
        println("Chave: $key, valor: $value")
    }

    val map2 = mapOf(
        "Pedro" to 2340.0,
        "Maria" to 5431.0
    )

    map2.forEach { (key, value) ->
        println("Chave: $key, valor: $value")
    }
}