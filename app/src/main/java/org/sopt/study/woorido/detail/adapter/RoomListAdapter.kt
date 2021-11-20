package org.sopt.study.woorido.detail.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import org.sopt.study.woorido.databinding.RoomListShapeBinding
import org.sopt.study.woorido.detail.data.RoomData
import org.sopt.study.woorido.detail.ui.MainActivity
import org.sopt.study.woorido.detail.ui.RankingActivity

class RoomListAdapter:RecyclerView.Adapter<RoomListAdapter.RoomListViewHolder>() {
    val roomList = mutableListOf<RoomData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoomListViewHolder {
        val binding = RoomListShapeBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return RoomListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RoomListViewHolder, position: Int) {
        holder.onBind(roomList[position])
    }

    override fun getItemCount(): Int = roomList.size

    class RoomListViewHolder(private val binding: RoomListShapeBinding):RecyclerView.ViewHolder(binding.root){
        fun onBind(data: RoomData){
            binding.tvRoomName.text=data.roomName
            binding.tvRoomIntro.text=data.roomIntro
            binding.tvMyTemp.text=data.temp
        }

        init{
            binding.root.setOnClickListener{
                val intent = Intent(binding.root?.context, RankingActivity::class.java)
                startActivity(binding.root.context, intent, null)
            }
        }
    }

}