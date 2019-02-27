package org.leapyears.domain

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class YearTests {

    @Test
    fun `All years divisible by 400 ARE leap years`() {
        assertTrue(Year(2000).isLeap)
    }

    @Test
    fun `All years divisible by 100 but not by 400 are NOT leap years`() {
        assertFalse(Year(1700).isLeap)
        assertFalse(Year(1800).isLeap)
        assertFalse(Year(1900).isLeap)
    }

    @Test
    fun `All years divisible by 4 but not by 100 ARE leap years`() {
        assertTrue(Year(2008).isLeap)
        assertTrue(Year(2012).isLeap)
        assertTrue(Year(2016).isLeap)
    }

    @Test
    fun `All years not divisible by 4 are NOT leap years`() {
        assertFalse(Year(2017).isLeap)
        assertFalse(Year(2018).isLeap)
        assertFalse(Year(2019).isLeap)
    }
}