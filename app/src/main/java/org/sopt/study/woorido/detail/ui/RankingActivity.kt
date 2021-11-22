package org.sopt.study.woorido.detail.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import org.sopt.study.woorido.R
import org.sopt.study.woorido.databinding.ActivityMainBinding
import org.sopt.study.woorido.databinding.ActivityRankingBinding
import org.sopt.study.woorido.detail.adapter.UserListAdapter
import org.sopt.study.woorido.detail.data.UserData

class RankingActivity : AppCompatActivity() {
    private lateinit var binding:ActivityRankingBinding
    private lateinit var userListAdapter:UserListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityRankingBinding.inflate(layoutInflater)
        val intent = Intent(this, SelectUserListActivity::class.java)
        binding.floatingActionButton.setOnClickListener{
            startActivity(intent)
        }
        initAdapter()
        initRanking()
        setContentView(binding.root)
    }

    private fun initAdapter(){
        userListAdapter= UserListAdapter()
        binding.rvUesrRank.adapter=userListAdapter
        userListAdapter.userList.addAll(
            listOf(
                UserData("이남걸", R.drawable.image_namgirl, "55.5", "1"),
                UserData("이창환", R.drawable.image_changhwan, "53.5", "2"),
                UserData("서호영", R.drawable.image_hoyeong, "50.5", "3"),
                UserData("한지우", R.drawable.image_jiwoo, "48.5", "4"),
                UserData("권용민", R.drawable.image_yongmin, "42.5", "5"),
                UserData("한아연", R.drawable.image_ahyeon, "40.5", "6"),
                UserData("이혜빈", R.drawable.image_hyebin, "39.5", "7")
            )
        )
        userListAdapter.notifyDataSetChanged()
    }

    private fun initRanking() {
        Glide.with(binding.imageView9).load(R.drawable.image_namgirl).circleCrop().into(binding.imageView9)
        Glide.with(binding.imageView7).load(R.drawable.image_changhwan).circleCrop().into(binding.imageView7)
        Glide.with(binding.imageView8).load(R.drawable.image_hoyeong).circleCrop().into(binding.imageView8)
    }
}