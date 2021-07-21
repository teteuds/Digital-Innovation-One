package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Mateus"
    var cpf: String = "123.456.789-00" 
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main(args: Array<String>) {
    val mateus = Pessoa()
    println(mateus.pessoaInfo())
}