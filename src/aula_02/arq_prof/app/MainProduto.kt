package app

import model.Produto

fun main() {

    val produto = Produto()

    produto.cadastrarProduto(
        "Notebook",
        101,
        3500.0,
        5,
        "Dell"
    )

    produto.categoria = "Eletrônicos"

    produto.mostrarProduto()

    produto.adicionarEstoque(10)

    produto.aplicarDesconto(10.0)

    println("Valor total em estoque: ${produto.calcularValorEstoque()}")
}