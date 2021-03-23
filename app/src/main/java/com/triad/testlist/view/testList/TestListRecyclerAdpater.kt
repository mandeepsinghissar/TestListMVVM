package com.triad.testlist.view.testList;

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.triad.testlist.databinding.TestListItemBinding

class TestListRecyclerAdpater (private val context: Context, private val mDeveloperModel: TestListViewModel
                               /*, private val listener: ClickListener*/
) :

    RecyclerView.Adapter<TestListRecyclerAdpater.DeveloperViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): DeveloperViewHolder {

       val binding = TestListItemBinding.inflate(LayoutInflater.from(context))

        return DeveloperViewHolder( binding)
    }

    override fun onBindViewHolder(mDeveloperViewHolder: DeveloperViewHolder, i: Int) {
        val currentStudent = mDeveloperModel.apiResponse.value?.data?.get(i)

       // mDeveloperViewHolder.mDeveloperListItemBinding.item.setOnClickListener { listener.onItemClick(currentStudent,i) }

        mDeveloperViewHolder.mDeveloperListItemBinding.model = currentStudent

    }

    override fun getItemCount(): Int {
        if(mDeveloperModel.apiResponse.value?.data  == null )
            return 0

        else return mDeveloperModel.apiResponse.value!!.data.size
    }



    inner class DeveloperViewHolder(var mDeveloperListItemBinding: TestListItemBinding) :
        RecyclerView.ViewHolder(mDeveloperListItemBinding.root)
}