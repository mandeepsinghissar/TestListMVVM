package com.triad.testlist.repository



import com.triad.testlist.network.TestListApi

class TestListRepository(private val api: TestListApi) : BaseRepository(){

    suspend fun getData() = safeApiCall2 {
        api.testListApi()
    }


}