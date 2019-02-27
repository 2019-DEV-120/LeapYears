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
}