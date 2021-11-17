package dev.marceloranngel.maxapp.model

data class Pedido(
    val NOMECLIENTE: String,
    val codigoCliente: String,
    val critica: String,
    val `data`: String,
    val legendas: List<String>,
    val numero_ped_Rca: Int,
    val numero_ped_erp: String,
    val status: String,
    val tipo: String
)