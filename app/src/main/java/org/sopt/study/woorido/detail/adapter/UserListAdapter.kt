package org.sopt.study.woorido.detail.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.sopt.study.woorido.R
import org.sopt.study.woorido.databinding.UserListShapeBinding
import org.sopt.study.woorido.detail.data.UserData

class UserListAdapter:RecyclerView.Adapter<UserListAdapter.UserListViewHolder>() {
    val userList = mutableListOf<UserData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserListViewHolder {
        val binding = UserListShapeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserListViewHolder, position: Int) {
        holder.onBind(userList[position], position)

    }

    override fun getItemCount(): Int = userList.size

    class UserListViewHolder(private val binding:UserListShapeBinding):RecyclerView.ViewHolder(binding.root){
        fun onBind(data: UserData, position:Int){
            binding.tvUserName.text=data.userName
            binding.tvUserRank.text=data.userRank
            binding.tvUserTemp.text=data.userTemp
            Glide.with(binding.ivUserProfile.context)
                .load(data.userProfile)
                .circleCrop()
                .into(binding.ivUserProfile)
        }
    }
}