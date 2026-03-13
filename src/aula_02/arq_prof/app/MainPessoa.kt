package app
import model.Pessoa

 fun main() {

        val pessoa = Pessoa()

        pessoa.nome = "Paola Bracho"
        pessoa.idade = 50
        pessoa.profissao = "Professora"
        pessoa.cidade = "São Paulo"

        pessoa.apresentar()
        pessoa.mostrarDados()
        pessoa.fazerAniversario()
    }
