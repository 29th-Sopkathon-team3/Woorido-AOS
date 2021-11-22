package org.sopt.study.woorido.detail.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.sopt.study.woorido.R
import org.sopt.study.woorido.databinding.ActivityScoreBinding

class ScoreActivity : AppCompatActivity() {
    private lateinit var binding:ActivityScoreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScoreBinding.inflate(layoutInflater)
        binding.btnScoreDone.setOnClickListener{
            finish()
        }
        setContentView(binding.root)


    }
}