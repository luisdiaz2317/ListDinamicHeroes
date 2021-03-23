package com.example.listadinamicaheroes

class Heroe (var name:String, var alterEgo:String, var url:String) {
    fun getFullName():String = "$alterEgo $name"
}