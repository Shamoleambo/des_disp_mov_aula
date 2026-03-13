package model

class Pessoa {

    var nome: String = ""
    var idade: Int = 0
    var cpf: String = ""
    var email: String = ""
    var telefone: String = ""
    var cidade: String = ""
    var estado: String = ""
    var profissao: String = ""

    fun apresentar() {
        println("Olá, meu nome é $nome")
    }

    fun mostrarDados() {
        println("Nome: $nome")
        println("Idade: $idade")
        println("CPF: $cpf")
        println("Email: $email")
        println("Telefone: $telefone")
        println("Cidade: $cidade")
        println("Estado: $estado")
        println("Profissão: $profissao")
    }

    fun fazerAniversario() {
        idade++
        println("$nome agora tem $idade anos")
    }
}