package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    val jose = Cliente(
        nome = "Jose da Silva",
        cpf  = "123.456.789-00",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autetica(jose)
}