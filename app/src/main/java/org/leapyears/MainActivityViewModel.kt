package org.leapyears

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.leapyears.domain.Year
import org.leapyears.domain.isLeap
import java.lang.Exception

class MainActivityViewModel: ViewModel() {

    private val _isLeapYear = MutableLiveData<Boolean?>()

    val isLeapYear: LiveData<Boolean?> = _isLeapYear

    fun checkYear(year: String) {
        try {
            val yearInt = year.toInt()
            _isLeapYear.value = Year(yearInt).isLeap
        } catch (_: Exception) {
            _isLeapYear.value = null
        }
    }
}