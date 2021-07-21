package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Mateus"
    var cpf: String = "123.456.789-00" 
    private set
}

fun main(args: Array<String>) {
    val mateus = Pessoa()
    println(mateus.nome)
    println(mateus.cpf)

}