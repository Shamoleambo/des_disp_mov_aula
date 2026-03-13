package model

class Funcionario {

    var nome: String = ""
    var cargo: String = ""
    var salario: Double = 0.0
    var departamento: String = ""
    var matricula: Int = 0
    var horasTrabalhadas: Int = 0
    var horasExtras: Int = 0
    var ativo: Boolean = true

    fun cadastrarFuncionario(
        nome: String,
        cargo: String,
        salario: Double
    ) {
        this.nome = nome
        this.cargo = cargo
        this.salario = salario
    }

    fun registrarHoras(horas: Int) {
        horasTrabalhadas += horas
    }

    fun registrarHoraExtra(horas: Int) {
        horasExtras += horas
    }

    fun aumentarSalario(percentual: Double) {
        salario += salario * percentual / 100
    }

    fun calcularSalarioAnual(): Double {
        return salario * 12
    }

    fun calcularPagamentoHora(): Double {
        return salario / 160
    }

    fun demitir() {
        ativo = false
        println("$nome foi desligado da empresa")
    }

    fun mostrarDados() {
        println("Nome: $nome")
        println("Cargo: $cargo")
        println("Departamento: $departamento")
        println("Salário: $salario")
    }
}