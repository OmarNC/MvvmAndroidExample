package com.onc.mvvmandroidexample.view.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.onc.mvvmandroidexample.R
import com.onc.mvvmandroidexample.databinding.FragmentListBinding
import com.onc.mvvmandroidexample.databinding.UserItemBinding
import com.onc.mvvmandroidexample.model.entities.User

class UserAdapter(private val items : ArrayList<User>): RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    var onItemClick : ((User) -> Unit)? = null

    class UserViewHolder(val binding: UserItemBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(user : User, onItemClick: ((User) -> Unit)?){
//            binding.tvName.text = "Nombre: ${user.name}"
//            binding.tvLastName.text = "Apellido: ${user.lastName}"
//            binding.tvAge.text = "Edad: ${user.age}"

            binding.user = user
//
            user?.image?.let {
                Glide.with(binding.root).load(user.image).placeholder(R.mipmap.ic_launcher)
                    .into(binding.image)
            }

             binding.userCard.setOnClickListener {
                onItemClick?.invoke(user)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = UserItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(items[position], onItemClick)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun updateItems(newItems : ArrayList<User>){
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()

    }
}