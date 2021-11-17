package dev.marceloranngel.maxapp.model

data class Cliente(
    val cnpj: String,
    val codigo: String,
    val contatos: List<Contato>,
    val endereco: String,
    val id: Int,
    val nomeFantasia: String,
    val ramo_atividade: String,
    val razao_social: String,
    val status: String
)