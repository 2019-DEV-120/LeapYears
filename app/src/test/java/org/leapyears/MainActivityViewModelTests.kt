package org.leapyears

import androidx.lifecycle.Observer
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(InstantExecutorExtension::class)
class MainActivityViewModelTests {

    @Test
    fun `checkYear updates isLeapYear`() {
        // given
        val viewModel = MainActivityViewModel()
        val observer = mock<Observer<Boolean?>>()
        viewModel.isLeapYear.observeForever(observer)
        // when
        viewModel.checkYear("2000")
        // then
        verify(observer).onChanged(any())
    }

    @Test
    fun `checkYear exception update isLeapYear`() {
        // given
        val viewModel = MainActivityViewModel()
        val observer = mock<Observer<Boolean?>>()
        viewModel.isLeapYear.observeForever(observer)
        // when
        viewModel.checkYear("abcd")
        // then
        verify(observer).onChanged(null)
    }
}