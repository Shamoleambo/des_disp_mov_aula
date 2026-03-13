package app

import model.heranca.Carro

fun main() {

    println("=== TESTE DA CLASSE CARRO ===")

    val carro = Carro()

    carro.marca = "Toyota"
    carro.modelo = "Corolla"
    carro.portas = 4

    carro.acelerar()
    carro.abrirPorta()
    carro.ligarArCondicionado()
    carro.frear()


}