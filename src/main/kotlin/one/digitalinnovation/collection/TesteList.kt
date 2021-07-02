package one.digitalinnovation.collection

fun main() {
    val caio = Funcionario(nome="Caio", salario=7200.0, tipoContracacao = "PJ")
    val mara = Funcionario(nome="Mara", salario=5200.0, tipoContracacao = "PJ")
    val joao = Funcionario(nome="João", salario=1200.0, tipoContracacao = "CLT")
    val paulo = Funcionario(nome="Paulo", salario=2200.0, tipoContracacao = "CLT")
    val robert = Funcionario(nome="Albert", salario=3200.0, tipoContracacao = "PJ")

    val funcionarios = listOf(joao, paulo, robert, caio, mara)

    println("\nFuncionários: ")
    funcionarios.forEach {
        println(it)
    }

    println("\nFuncionário Específico: ")
    println(funcionarios.find { it.nome == "Paulo" })

    // Ordenando
    println("\nOrdenando Salário: ")
    funcionarios.sortedBy {
        it.salario
    }.forEach {
        println(it)
    }

    // Agrupando
    println("\nAgrupando Tipo Contratação: ")
    funcionarios.groupBy {
        it.tipoContracacao
    }.forEach {
        println(it)
    }
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContracacao: String
){
    override fun toString(): String =
        """
            Nome: $nome, salário: R$ $salario
        """.trimIndent()
}