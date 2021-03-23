package com.triad.testlist.network

import com.triad.testlist.responses.TestListResponse
import com.triad.testlist.utility.Constants
import retrofit2.http.Body
import retrofit2.http.GET

interface TestListApi {
     @GET(Constants.Url.TESTlIST)
     suspend fun testListApi() : TestListResponse

 }