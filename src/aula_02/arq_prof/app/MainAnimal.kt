package app

import model.Animal

fun main() {

    val animal = Animal()

    animal.cadastrarAnimal()

    animal.alimentar()

    animal.brincar()

    animal.dormir()

    animal.mostrarDados()
}