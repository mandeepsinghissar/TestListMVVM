package com.triad.testlist.view.testList

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.triad.testlist.databinding.TestListItemBinding
import com.triad.testlist.responses.TestListResponse


class TestListAdapter(
    private val context: Context,
    private val viewModel: TestListViewModel) : BaseAdapter() {


    override fun getCount(): Int {
        if(viewModel.apiResponse.value==null)
            return 0;

       else return viewModel.apiResponse.value!!.data.size
    }

    override fun getItem(i: Int): TestListResponse.Data? {
             return viewModel.apiResponse.value!!.data[i]
    }

    override fun getItemId(i: Int): Long {
        return i.toLong()
    }

    override fun getView(i: Int, convertView: View?, viewGroup: ViewGroup?): View? {


        val binding: TestListItemBinding
        if (convertView == null) {
            binding = TestListItemBinding.inflate(LayoutInflater.from(context))
            binding.root.tag = binding
        } else {
            binding = convertView.tag as TestListItemBinding
        }


        binding.model = getItem(i)


        return binding.root

    }

}