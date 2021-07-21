package one.digitalinnovation.digionebank

class Pessoa {
   var nome: String = "Mateus"
   var cpf: String = "123.456.789-00" 
}

fun main(args: Array<String>) {
    val mateus = Pessoa()
    println(mateus.nome)
    println(mateus.cpf)
}