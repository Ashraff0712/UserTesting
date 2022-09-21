package com.example.usertesting

object RegistrationUtil {
    fun validate(
        userName:String,
        password:String,
        confirmPassword:String
    ):Boolean{
        if (password!=confirmPassword){
            return false
        }
        if (password.length<8){
            return false
        }
        return true
    }
}