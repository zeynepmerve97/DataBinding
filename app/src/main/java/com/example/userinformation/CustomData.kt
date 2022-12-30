package com.example.userinformation
import java.io.Serializable


data class CustomData(
    var name: String? = null,
    var age: Int? = null,
    var isApproved: Boolean? = null,

): Serializable{

}

