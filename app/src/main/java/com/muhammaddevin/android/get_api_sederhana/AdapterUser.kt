package com.muhammaddevin.android.get_api_sederhana

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.muhammaddevin.android.get_api_sederhana.data.UserItem
import com.muhammaddevin.android.get_api_sederhana.databinding.ItemUsersBinding

class AdapterUser: RecyclerView.Adapter<AdapterUser.UserViewHolder>() {
    private val listUser = ArrayList<UserItem>()
    class UserViewHolder(val itemUser: ItemUsersBinding): RecyclerView.ViewHolder(itemUser.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = UserViewHolder(
        ItemUsersBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.itemUser.apply {
            with(listUser[position]){
                textView.text = login
                Glide.with(imageView.context).load(avatarUrl).into(imageView)
            }
        }
    }

    override fun getItemCount() = listUser.size

    fun setUser(user: ArrayList<UserItem>){
        this.listUser.clear()
        this.listUser.addAll(user)
    }
}