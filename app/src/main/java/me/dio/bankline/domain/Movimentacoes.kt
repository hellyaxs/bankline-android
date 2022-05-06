package me.dio.bankline.domain

data class Movimentacoes(
    val id: Int,
    val dataHora:String,
    val descricao: String,
    val valor: Double,
    val tipo: TipoMovimentacao,
    //todo mappper "idConta" ->""idCorrentista
    val idCorrentista: Int
)
