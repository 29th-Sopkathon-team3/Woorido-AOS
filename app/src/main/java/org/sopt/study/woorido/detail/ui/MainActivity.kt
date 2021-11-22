package org.sopt.study.woorido.detail.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.sopt.study.woorido.R
import org.sopt.study.woorido.databinding.ActivityMainBinding
import org.sopt.study.woorido.detail.adapter.RoomListAdapter
import org.sopt.study.woorido.detail.data.RoomData
import org.sopt.study.woorido.ui.UserJoinActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var roomListAdapter:RoomListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        val intent = Intent(this, RoomCreateActivity::class.java)
        val intent2 = Intent(this, UserJoinActivity::class.java)
        binding.btnCreateRoom.setOnClickListener{
            startActivity(intent)
        }
        binding.btnParticipate.setOnClickListener{
            startActivity(intent2)
        }
//        binding.rvRoomList.setOnClickListener{
//            startActivity(intent2)
//        }
        initAdapter()
        setContentView(binding.root)
    }

    private fun initAdapter(){
        roomListAdapter= RoomListAdapter()
        binding.rvRoomList.adapter=roomListAdapter
        roomListAdapter.roomList.addAll(
            listOf(
                RoomData("WE SOPT 29th", "50.5","199명 중 1등이에요"),
                RoomData("솝커톤 3조", "48.5", "9명 중 3등이에요"),
                RoomData("알짜배Git", "34.5", "6명 중 4등이에요"),
            )
        )

        roomListAdapter.notifyDataSetChanged()
    }
}