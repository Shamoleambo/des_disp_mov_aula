package model

open class Veiculo {

    var marca: String = ""
    var velocidade: Int = 0

    open fun acelerar() {
        velocidade += 10
        println("O veículo acelerou. Velocidade: $velocidade")
    }

    fun frear() {
        velocidade -= 10
        if (velocidade < 0) {
            velocidade = 0
        }
        println("O veículo freou. Velocidade: $velocidade")
    }
}