package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main(args: Array<String>){
    val joao = Analista( nome: "João Pedro", cpf: "123456789-00", salario: 2000.00)
    imprimeRelatorioFuncionario.imprime(joao)
}


