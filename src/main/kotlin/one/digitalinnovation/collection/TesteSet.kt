package one.digitalinnovation.collection

fun main() {
    val caio = Funcionario(nome="Caio", salario=7200.0, tipoContracacao = "PJ")
    val mara = Funcionario(nome="Mara", salario=5200.0, tipoContracacao = "PJ")
    val joao = Funcionario(nome="João", salario=1200.0, tipoContracacao = "CLT")
    val paulo = Funcionario(nome="Paulo", salario=2200.0, tipoContracacao = "CLT")
    val robert = Funcionario(nome="Albert", salario=3200.0, tipoContracacao = "PJ")

    val funcionarios = setOf(caio, mara, robert)
    val funcionarios2 = setOf(joao, paulo)

    // União de SETs
    println("\nUnião de sets")
    val resultUnioun = funcionarios.union(funcionarios2)
    resultUnioun.forEach {
        println(it)
    }

    // Subtraindo SETs
    println("\nSubtração de sets")
    val funcionarios3 = setOf(joao, paulo, robert)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach {
        println(it)
    }

    // Interseção SETs
    println("\nInterseção de sets")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach {
        println(it)
    }
}