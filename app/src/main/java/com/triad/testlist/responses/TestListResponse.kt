package com.triad.testlist.responses

data class TestListResponse(
    val code: Int,
    var `data`: List<Data>,
    val meta: Meta
){
    data class Meta(
        val pagination: Pagination
    ){
        data class Pagination(
            val limit: Int,
            val page: Int,
            val pages: Int,
            val total: Int
        )
    }
    data class Data(
        val created_at: String,
        val email: String,
        val gender: String,
        val id: Int,
        val name: String,
        val status: String,
        val updated_at: String
    )
}