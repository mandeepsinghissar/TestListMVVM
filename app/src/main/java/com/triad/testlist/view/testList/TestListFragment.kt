package com.triad.testlist.view.testList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.triad.testlist.R
import com.triad.testlist.app.App
import com.triad.testlist.databinding.FragmentTestListBinding
import com.triad.testlist.network.TestListApi
import com.triad.testlist.repository.TestListRepository
import com.triad.testlist.utility.Constants
import com.triad.testlist.utility.UtilityMethods
import com.triad.testlist.utility.snackbar
import com.triad.testlist.utility.visible
import com.triad.testlist.view.base.BaseFragment
import com.triad.testlist.view.main.MainActivity

class TestListFragment : BaseFragment<TestListViewModel, FragmentTestListBinding, TestListRepository>() {


    private lateinit var testListRecyclerAdpater: TestListRecyclerAdpater

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


            viewModel.apiResponse.observe(viewLifecycleOwner, Observer {

                binding.progressView.stopAnimation()
                binding.loaderLayout.visibility = View.GONE

               if(viewModel.apiResponse.value?.code  == Constants.SUCCESS)
               {
                   binding.listViewTestList.visible(true)

               }else{

               }
           })



        testListRecyclerAdpater = TestListRecyclerAdpater(App.applicationContext(),  viewModel)
        val layoutManager = GridLayoutManager(context,1)

        binding.listViewTestList.layoutManager = layoutManager
        binding.listViewTestList.hasFixedSize()
        binding.listViewTestList.addItemDecoration(DividerItemDecoration(context, layoutManager.orientation))
        binding.listViewTestList.adapter = testListRecyclerAdpater

        if(UtilityMethods.isNetworkAvailable(MainActivity.context)) {
            apiCall()
        }else{
            binding.heading.snackbar("No Network Available.")
        }

        binding.heading.setOnClickListener { apiCall() }
    }

    private fun apiCall(): (() -> Unit)? {
        binding.loaderLayout.visibility = View.VISIBLE
        binding.progressView.startAnimation()
        viewModel.fetch()
        return null
    }


    override fun getViewModel() = TestListViewModel::class.java

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): ViewDataBinding {

        return DataBindingUtil.inflate(inflater, R.layout.fragment_test_list, container, false)

    }


    override fun getFragmentRepository(): TestListRepository {

        return TestListRepository(remoteDataSource.buildApi(TestListApi::class.java))

    }


}