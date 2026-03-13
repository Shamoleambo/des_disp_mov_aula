package app

import model.heranca.Moto

fun main() {

    println("=== TESTE DA CLASSE MOTO ===")

    val moto = Moto()

    moto.marca = "Honda"
    moto.cilindradas = 600
    moto.tipo = "Esportiva"

    moto.acelerar()
    moto.empinar()
    moto.buzinar()
    moto.frear()
}