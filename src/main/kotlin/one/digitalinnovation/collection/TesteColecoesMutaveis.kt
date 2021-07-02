package one.digitalinnovation.collection

fun main() {
    val caio = Funcionario(nome="Caio", salario=7200.0, tipoContracacao = "PJ")
    val mara = Funcionario(nome="Mara", salario=5200.0, tipoContracacao = "PJ")
    val joao = Funcionario(nome="João", salario=1200.0, tipoContracacao = "CLT")
    val paulo = Funcionario(nome="Paulo", salario=2200.0, tipoContracacao = "CLT")
    val robert = Funcionario(nome="Albert", salario=3200.0, tipoContracacao = "PJ")

    println("LIST")
    val funcionarios = mutableListOf(caio, mara)
    funcionarios.forEach {
        println(it)
    }

    mensangem()
    funcionarios.add(joao)
    funcionarios.forEach { println(it) }

    mensangem()
    funcionarios.remove(mara)
    funcionarios.forEach { println(it) }

    println("\nSET")
    val funcionarioSet = mutableSetOf(joao, paulo)

    mensangem()
    funcionarioSet.add(robert)
    funcionarioSet.forEach { println(it) }

    mensangem()
    funcionarioSet.remove(paulo)
    funcionarioSet.forEach { println(it) }

}

fun mensangem(){
    println("\n---------------------------")
}