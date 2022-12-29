package com.sistemas.ejemplomvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sistemas.ejemplomvvm.model.QuoteModel
import com.sistemas.ejemplomvvm.model.QuoteProvider

class QuoteViewModel : ViewModel(){
    //QuoteModel va ir cambiando
    val quoteModel = MutableLiveData<QuoteModel>() //quoteModel avisa al activity que hay cambios

    fun randomQuote(){ //esta funcion será llamada cuando se de click por la vista
        val currentQuote : QuoteModel = QuoteProvider.random() //se comunica con el modelo
        quoteModel.postValue(currentQuote)
    }
}