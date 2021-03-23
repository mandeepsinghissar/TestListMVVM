package com.triad.testlist.interfaces

import android.view.View
import com.triad.testlist.databinding.TestListItemBinding

interface RecyclerViewClickListener {

    fun onRecyclerViewItemClick(view: View, movieItem: TestListItemBinding)
}