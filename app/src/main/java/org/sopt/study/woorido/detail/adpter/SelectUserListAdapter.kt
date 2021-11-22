package org.sopt.study.woorido.detail.adpter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.sopt.study.woorido.databinding.UserRecyclerViewItemBinding
import org.sopt.study.woorido.detail.data.UserData
import org.sopt.study.woorido.detail.data.UserData2

class SelectUserListAdapter : RecyclerView.Adapter<SelectUserListAdapter.SelectUserListViewHolder>(){
    private var selectListener : ((UserData2) -> Unit)? = null
    var selectUserData = mutableListOf<UserData2>()

    fun setSelectListener(listener : (UserData2) -> Unit) {
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
        fun onBind(data: UserData2){
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