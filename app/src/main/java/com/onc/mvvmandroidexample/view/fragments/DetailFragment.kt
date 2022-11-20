package com.onc.mvvmandroidexample.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.onc.mvvmandroidexample.R
import com.onc.mvvmandroidexample.databinding.FragmentDetailBinding
import com.onc.mvvmandroidexample.databinding.FragmentListBinding
import com.onc.mvvmandroidexample.model.entities.User

class DetailFragment : Fragment(R.layout.fragment_detail) {

    private lateinit var binding : FragmentDetailBinding
    private  var user : User? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let{
            user = it.getSerializable(ARG_USER) as User?
        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDetailBinding.bind(view)
        val name =requireActivity().getString(R.string.detail_name, user?.name)
        val lastName =requireActivity().getString(R.string.detail_lastName, user?.lastName)
        //val age =requireActivity().getString(R.string.detail_age, user?.age.toString())
        val age =requireActivity().getString(R.string.detail_age_i, user?.age)

        binding.tvName.text = name
        binding.tvLastName.text = lastName
        binding.tvAge.text = age
    }

    companion object {

        private const val ARG_USER = "ARG_USER"

        fun newInstance(user: User): DetailFragment {
            return DetailFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(ARG_USER, user)

                }
            }
        }
    }
}