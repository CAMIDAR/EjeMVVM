package com.sistemas.ejemplomvvm.model

class QuoteProvider {
    //companion object==puede acceder a todos los miembros de la clase o
    // interfaz, incluyendo los miembros privados.
    companion object {

        fun random():QuoteModel {
            val position:Int = (0..3).random()
            return quote[position]
        }

        private val quote = listOf<QuoteModel>(
            QuoteModel(
                quote = "Esto es un model",
                author = "Carlos"
            ),
            QuoteModel(
                quote = "Esto es un quote",
                author = "Edy"
            ),
            QuoteModel(
                quote = "El de abajo es su autor",
                author = "Rusman"
            ),
            QuoteModel(
            quote = "El de abajo es su autor 2",
            author = "Ads"
        )
        )
    }
}