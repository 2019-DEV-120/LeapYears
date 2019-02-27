package org.leapyears.domain

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class YearTests {

    @Test
    fun `All years divisible by 400 ARE leap years`() {
        assertTrue(Year(2000).isLeap)
    }

}