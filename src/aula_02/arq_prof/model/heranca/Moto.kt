package model.heranca

import model.Veiculo

class Moto : Veiculo() {

    var cilindradas: Int = 0
    var tipo: String = ""

    override fun acelerar() {
        velocidade += 30
        println("A moto acelerou muito rápido! Velocidade: $velocidade")
    }

    fun empinar() {
        println("A moto está empinando!")
    }

    fun buzinar() {
        println("Biiiiiiii!")
    }
}