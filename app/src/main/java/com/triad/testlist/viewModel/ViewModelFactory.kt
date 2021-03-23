package com.triad.testlist.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.triad.testlist.repository.*
import com.triad.testlist.view.testList.TestListViewModel

@Suppress("UNCHECKED_CAST")
class ViewModelFactory(private val repository: BaseRepository): ViewModelProvider.NewInstanceFactory(){

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        return when{

            modelClass.isAssignableFrom(TestListViewModel::class.java) -> TestListViewModel(
                repository as TestListRepository
            ) as T


            else -> throw IllegalArgumentException("ViewModel Not Found")
        }

    }


}