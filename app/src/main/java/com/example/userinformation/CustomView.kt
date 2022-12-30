package com.example.userinformation

import android.content.Context
import android.graphics.Bitmap
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.example.userinformation.databinding.CustomViewBinding


class CustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    ): CardView(context, attrs,defStyle) {


    private lateinit var binding: CustomViewBinding

    init {
        init()
    }

    private fun init(){
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.custom_view,
            this,
            true
        )
    }

    fun bindData(name: String, age: String, icon: String){
        binding.txtName.text = name
        binding.txtAge.text = age
        Glide.with(this)
            .load(icon)
            .into(binding.imgOnay)

    }

}






