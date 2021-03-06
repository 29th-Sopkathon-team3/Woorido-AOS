package org.sopt.study.woorido.detail.adpter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.MutableLiveData
import com.bumptech.glide.Glide

object BindingAdapters {

    @JvmStatic
    @BindingAdapter("recyclerGlide")
    fun setImage (imageview : ImageView, url : MutableLiveData<String>){
        Glide.with(imageview.context)
            .load(url.value)
            .circleCrop()
            .into(imageview)
    }
}