package com.triad.testlist.interfaces

import com.triad.testlist.responses.TestListResponse

interface ClickListener {
    fun onItemClick(
        item: TestListResponse.Data?,
        position: Int
    );

}