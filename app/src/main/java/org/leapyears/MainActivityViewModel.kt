package org.leapyears

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.leapyears.domain.Year
import org.leapyears.domain.isLeap

class MainActivityViewModel: ViewModel() {

    private val _isLeapYear = MutableLiveData<Boolean>()

    val isLeapYear: LiveData<Boolean> = _isLeapYear

    fun checkYear(year: String) {
        _isLeapYear.value = Year(year.toInt()).isLeap
    }
}