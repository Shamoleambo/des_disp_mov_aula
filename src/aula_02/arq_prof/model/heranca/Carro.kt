package model.heranca

import model.Veiculo

class Carro : Veiculo() {

    var portas: Int = 4
    var modelo: String = ""

    override fun acelerar() {
        velocidade += 20
        println("O carro acelerou rapidamente. Velocidade: $velocidade")
    }

    fun abrirPorta() {
        println("Abrindo a porta do carro")
    }

    fun ligarArCondicionado() {
        println("Ar condicionado ligado")
    }
}