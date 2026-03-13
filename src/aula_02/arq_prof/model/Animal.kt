package model

class Animal {

    var nome: String = ""
    var especie: String = ""
    var idade: Int = 0
    var peso: Double = 0.0
    var energia: Int = 100
    var fome: Int = 0
    var saude: Int = 100
    var humor: String = "Neutro"

    fun cadastrarAnimal() {

        println("Digite o nome do animal:")
        nome = readLine() ?: ""
        // readLine() pode retornar null
        // ?: significa "se for null, use este valor"
        // aqui usamos "" (string vazia)

        println("Digite a espécie:")
        especie = readLine() ?: ""

        println("Digite a idade:")
        idade = readLine()?.toIntOrNull() ?: 0
        // readLine() lê texto do teclado
        // ?. significa: só execute o próximo método se NÃO for null
        // toIntOrNull() tenta converter para inteiro
        // se falhar retorna null
        // ?: 0 significa: se for null, use 0

        println("Digite o peso:")
        peso = readLine()?.toDoubleOrNull() ?: 0.0
        // mesmo princípio do exemplo anterior
        // tenta converter para Double
        // se não conseguir, usa 0.0

        println("Animal cadastrado com sucesso!")
    }

    fun alimentar() {

        println("Quantidade de comida:")
        val quantidade = readLine()?.toIntOrNull() ?: 0
        // ?. evita erro se readLine retornar null
        // ?: define valor padrão

        fome -= quantidade

        if (fome < 0) {
            fome = 0
        }

        energia += quantidade * 2

        println("$nome foi alimentado.")
    }

    fun brincar() {

        println("Tempo de brincadeira (minutos):")
        val tempo = readLine()?.toIntOrNull() ?: 0

        energia -= tempo * 5
        fome += tempo * 3

        if (energia < 20) {
            humor = "Cansado"
        } else {
            humor = "Feliz"
        }

        println("$nome brincou por $tempo minutos.")
    }

    fun dormir() {

        println("Quantas horas o animal dormiu?")
        val horas = readLine()?.toIntOrNull() ?: 0

        energia += horas * 10

        if (energia > 100) {
            energia = 100
        }

        saude += horas * 2

        println("$nome dormiu por $horas horas.")
    }

    fun verificarEstado(): String {

        return "Energia: $energia | Fome: $fome | Saúde: $saude | Humor: $humor"
    }

    fun mostrarDados() {

        println("----- DADOS DO ANIMAL -----")
        println("Nome: $nome")
        println("Espécie: $especie")
        println("Idade: $idade")
        println("Peso: $peso")

        println(verificarEstado())
    }
}