package org.sopt.study.woorido.detail.adpter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.sopt.study.woorido.databinding.UserRecyclerViewItemBinding
import org.sopt.study.woorido.detail.data.UserData

class SelectUserListAdapter : RecyclerView.Adapter<SelectUserListAdapter.SelectUserListViewHolder>(){
    private var selectListener : ((UserData) -> Unit)? = null
    var selectUserData = mutableListOf<UserData>()

    fun setSelectListener(listener : (UserData) -> Unit) {
        selectListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelectUserListViewHolder {
        val binding = UserRecyclerViewItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return SelectUserListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SelectUserListViewHolder, position: Int) {
       holder.onBind(selectUserData[position])
    }

    override fun getItemCount(): Int = selectUserData.size


    inner class SelectUserListViewHolder(private val binding: UserRecyclerViewItemBinding): RecyclerView.ViewHolder(binding.root){
        fun onBind(data: UserData){
            binding.selectUserData = data
            Glide.with(binding.ivUserList).load(data.userImg).circleCrop().into(binding.ivUserList)
        }

        init {
            binding.root.setOnClickListener{
                binding.rbUserList.isSelected = true
                selectListener?.invoke(selectUserData[adapterPosition])
            }
        }
    }
}