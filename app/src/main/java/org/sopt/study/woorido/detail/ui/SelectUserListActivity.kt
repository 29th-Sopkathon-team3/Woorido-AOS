package org.sopt.study.woorido.detail.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import org.sopt.study.woorido.R
import org.sopt.study.woorido.databinding.ActivitySelectUserListBinding
import org.sopt.study.woorido.detail.adpter.SelectUserListAdapter
import org.sopt.study.woorido.detail.adpter.SelectedUserListAdapter
import org.sopt.study.woorido.detail.api.ServiceCreator
import org.sopt.study.woorido.detail.data.PartData
import org.sopt.study.woorido.detail.data.ResponseData
import org.sopt.study.woorido.detail.data.UserData
import org.sopt.study.woorido.detail.data.UserData2
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SelectUserListActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySelectUserListBinding
    private lateinit var selectUserListadapter: SelectUserListAdapter
    private lateinit var selectedUserListAdapter: SelectedUserListAdapter
    private val selectedUserDataList = mutableListOf<UserData2>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_select_user_list)

        siteSelectUserListRecycler()
        siteSelectedUserListRecycler()
        goToScoreActivity()
    }



    fun siteSelectUserListRecycler() {
        selectUserListadapter = SelectUserListAdapter()

        binding.rvVertical.adapter = selectUserListadapter

        selectUserListadapter.selectUserData.addAll(
            listOf(
                UserData2("권세훈",R.drawable.one,1),
                UserData2("권용민",R.drawable.two,2),
                UserData2("김서영",R.drawable.three,3),
                UserData2("김인아",R.drawable.four,4),
                UserData2("김재민",R.drawable.five,5),
                UserData2("김현아",R.drawable.six,6),
                UserData2("문수빈",R.drawable.seven,7),
                UserData2("서예리",R.drawable.eight,8),
                UserData2("서호영",R.drawable.nine,9),
                UserData2("양혜주",R.drawable.ten,10),


            )
        )

        selectUserListadapter.notifyDataSetChanged()

        selectUserListadapter.setSelectListener {
            selectedUserDataList.add(it)
        }
    }

    fun siteSelectedUserListRecycler() {
        selectedUserListAdapter = SelectedUserListAdapter()

        selectedUserListAdapter.selectedUserData.addAll(
            listOf(
            UserData2("김재민",R.drawable.five,5),
            UserData2("김현아",R.drawable.six,6),
            UserData2("문수빈",R.drawable.seven,7),
            UserData2("서예리",R.drawable.eight,8),
            )
        )
        binding.rvHorizontal.adapter = selectedUserListAdapter

        selectedUserListAdapter.notifyDataSetChanged()

    }


    fun goToScoreActivity() {
        binding.btnDoneUserList.setOnClickListener {
            val intent = Intent(this, ScoreActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}