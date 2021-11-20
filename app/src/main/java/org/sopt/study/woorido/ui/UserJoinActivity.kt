package org.sopt.study.woorido.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.sopt.study.woorido.databinding.ActivityUserJoinBinding

class UserJoinActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserJoinBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserJoinBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //setContentView(R.layout.activity_user_join)

        binding.btnDelete.setOnClickListener {
            binding.etRoomCode.setText("")
        }

        binding.btnTeamName.setOnClickListener {
            val intent = Intent(this,JoinProfileActivity::class.java)
            startActivity(intent)

        }
    }
}