package app

import model.Funcionario

fun main() {

    val f = Funcionario()

    f.cadastrarFuncionario(
        "Ana",
        "Analista",
        5000.0
    )

    f.departamento = "TI"

    f.registrarHoras(160)

    f.registrarHoraExtra(10)

    f.aumentarSalario(10.0)

    f.mostrarDados()

    println("Salário anual: ${f.calcularSalarioAnual()}")
}