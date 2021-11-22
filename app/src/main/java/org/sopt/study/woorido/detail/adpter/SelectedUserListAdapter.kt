package org.sopt.study.woorido.detail.adpter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.sopt.study.woorido.databinding.UserRecyclerViewItemBinding
import org.sopt.study.woorido.databinding.UserSelectedRecyclerViewItemBinding
import org.sopt.study.woorido.detail.data.UserData
import org.sopt.study.woorido.detail.data.UserData2

class SelectedUserListAdapter :
    RecyclerView.Adapter<SelectedUserListAdapter.SelectedUserListViewHolder>() {

    var selectedUserData = mutableListOf<UserData2>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelectedUserListViewHolder {
        val binding = UserSelectedRecyclerViewItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return SelectedUserListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SelectedUserListViewHolder, position: Int) {
        holder.onBind(selectedUserData[position])
    }

    override fun getItemCount(): Int =selectedUserData.size

    inner class SelectedUserListViewHolder(private val binding: UserSelectedRecyclerViewItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: UserData2) {
            binding.selectedUserData = data
            Glide.with(binding.imageView2).load(data.userImg).circleCrop().into(binding.imageView2)
        }
    }
}