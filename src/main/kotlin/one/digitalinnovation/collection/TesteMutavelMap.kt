package one.digitalinnovation.collection

fun main() {
    val caio = Funcionario(nome="Caio", salario=7200.0, tipoContracacao = "PJ")
    val mara = Funcionario(nome="Mara", salario=5200.0, tipoContracacao = "PJ")
    val joao = Funcionario(nome="João", salario=1200.0, tipoContracacao = "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(caio.nome, caio)
    repositorio.create(mara.nome, mara)

    println("\nBY ID")
    println(repositorio.findById(joao.nome))

    println("\nALL")
    repositorio.findAll().forEach { println(it) }

    println("\nREMOVE BY ID")
    repositorio.remove(joao.nome)
    repositorio.findAll().forEach { println(it) }
}