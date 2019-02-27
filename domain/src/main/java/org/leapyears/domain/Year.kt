package org.leapyears.domain

data class Year(val year: Int)

val Year.isLeap: Boolean get() =

    when {
        year.isDivisibleBy(400) -> true
        year.isDivisibleBy(100) -> false
        year.isDivisibleBy(4) -> true
        else -> false
    }

private fun Int.isDivisibleBy(divisor: Int) = (this % divisor == 0)