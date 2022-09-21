package com.example.usertesting

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test

class RegistrationUtilTest{
    @Test
    fun `test validate input`(){
        val result = RegistrationUtil.validate("Ashra","uyigdas","cdfef")
        Assert.assertFalse(result)
    }
}