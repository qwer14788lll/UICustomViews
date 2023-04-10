package com.example.uicustomviews

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.uicustomviews.databinding.TitleBinding

class TitleLayout(context: Context, attrs: AttributeSet) : ConstraintLayout(context, attrs) {
    private lateinit var mBinding: TitleBinding

    init {
        //动态加载布局
        LayoutInflater.from(context).inflate(R.layout.title, this)
        mBinding = TitleBinding.bind(this)

        mBinding.titelBackBtn.setOnClickListener {
            val a = context as Activity
            a.finish()
        }
    }

    public fun setTitle(title: String) {
        mBinding.titleText.text = title
    }

    public fun setEditOnClickListener(click: OnClickListener) {
        mBinding.titleEditBtn.setOnClickListener(click)
    }
}