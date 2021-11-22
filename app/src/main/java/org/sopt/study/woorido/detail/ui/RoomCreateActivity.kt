package org.sopt.study.woorido.detail.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.sopt.study.woorido.DataBinderMapperImpl
import org.sopt.study.woorido.R
import org.sopt.study.woorido.databinding.ActivityRoomCreateBinding

class RoomCreateActivity : AppCompatActivity() {
    private lateinit var binding:ActivityRoomCreateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityRoomCreateBinding.inflate(layoutInflater)
        binding.button.setOnClickListener{
            binding.textView3.text="0B15SE"
        }
        setContentView(binding.root)
    }
}