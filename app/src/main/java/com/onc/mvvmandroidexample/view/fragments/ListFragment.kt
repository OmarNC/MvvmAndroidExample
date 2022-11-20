package com.onc.mvvmandroidexample.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.onc.mvvmandroidexample.R
import com.onc.mvvmandroidexample.databinding.FragmentListBinding
import com.onc.mvvmandroidexample.view.adapters.UserAdapter
import com.onc.mvvmandroidexample.viewmodel.ListViewModel

class ListFragment : Fragment(R.layout.fragment_list) {

    private val userViewModel: ListViewModel by viewModels()

    private lateinit var binding : FragmentListBinding
    private lateinit var adapter : UserAdapter

/*    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       // return super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_list, container, false)
    }*/

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentListBinding.bind(view)
        adapter = UserAdapter(arrayListOf())

        adapter.onItemClick = {
//            parentFragmentManager.beginTransaction()
//                .replace(R.id.container, DetailFragment.newInstance(it))
//                .addToBackStack("DetailFragment")
//                .commit()

            parentFragmentManager.commit{
                replace(R.id.container, DetailFragment.newInstance(it))
                addToBackStack("DetailFragment")
            }
        }

        binding.userList.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
        binding.userList.adapter =adapter

        userViewModel.getUserList()

        userViewModel.list.observe(viewLifecycleOwner, Observer {
            adapter.updateItems(it)
        })
    }
}