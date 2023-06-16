package com.axel.basedejava

data class PersonKotlin(
    private var prenom : String?,
    private var nom : String,
    private var age : Int
){
    fun marcher(){
        println("Je marche")
    }

    fun fullName() = "$prenom $nom"

}
