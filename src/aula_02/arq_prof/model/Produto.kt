package model

class Produto {
    var nome: String = ""
    var codigo: Int = 0
    var preco: Double = 0.0
    var quantidade: Int = 0
    var marca: String = ""
    var categoria: String = ""
    var peso: Double = 0.0
    var descricao: String = ""
    var fornecedor: String = ""
    var ativo: Boolean = true

    fun cadastrarProduto(
        nome: String,
        codigo: Int,
        preco: Double,
        quantidade: Int,
        marca: String
    ) {
        this.nome = nome
        this.codigo = codigo
        this.preco = preco
        this.quantidade = quantidade
        this.marca = marca
    }

    fun adicionarEstoque(qtd: Int) {
        quantidade += qtd
        println("Estoque atualizado: $quantidade")
    }

    fun removerEstoque(qtd: Int) {
        if (qtd <= quantidade) {
            quantidade -= qtd
        } else {
            println("Estoque insuficiente")
        }
    }

    fun aplicarDesconto(percentual: Double) {
        preco -= preco * percentual / 100
    }

    fun aumentarPreco(percentual: Double) {
        preco += preco * percentual / 100
    }

    fun calcularValorEstoque(): Double {
        return preco * quantidade
    }

    fun mostrarProduto() {
        println("Produto: $nome")
        println("Código: $codigo")
        println("Marca: $marca")
        println("Preço: $preco")
        println("Quantidade: $quantidade")
        println("Categoria: $categoria")
    }
}