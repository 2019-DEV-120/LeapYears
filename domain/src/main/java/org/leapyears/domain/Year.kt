package org.leapyears.domain

data class Year(val year: Int)

val Year.isLeap: Boolean get() =

    when {
        year.isDivisibleBy(400) -> true
        else -> false
    }

private fun Int.isDivisibleBy(divisor: Int) = (this % divisor == 0)