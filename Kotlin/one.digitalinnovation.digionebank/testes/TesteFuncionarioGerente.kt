package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main(args: Array<String>){
    val maria = Gerente( 
        nome: "Maria do Carmo", 
        cpf: "123456789-00",
        salario: 5000.00, 
        senha: "senha12"
    )
    
    imprimeRelatorioFuncionario.imprime(maria)
    TesteAutenticacao().autetica(maria)
}


