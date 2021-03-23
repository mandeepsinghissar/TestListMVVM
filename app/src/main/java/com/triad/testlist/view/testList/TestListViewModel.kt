package com.triad.testlist.view.testList

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.triad.testlist.repository.TestListRepository
import com.triad.testlist.responses.TestListResponse
import kotlinx.coroutines.launch

class TestListViewModel(private var repository: TestListRepository) : ViewModel() {


    private val _apiResponse: MutableLiveData<TestListResponse>
            = MutableLiveData<TestListResponse>().apply { value?.data  = emptyList() }

    val apiResponse: LiveData<TestListResponse> get() = _apiResponse


    fun fetch() = viewModelScope.launch {
        _apiResponse.value = repository.getData()
    }



}