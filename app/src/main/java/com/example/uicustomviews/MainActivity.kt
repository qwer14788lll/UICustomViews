package com.example.uicustomviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.uicustomviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding
    private var num = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.titleLayout.setTitle("首页")

        mBinding.titleLayout.setEditOnClickListener {
            Toast.makeText(this, "点击了编辑按钮", Toast.LENGTH_LONG).show()
        }

        mBinding.mainBtnAdd1.setOnClickListener {
            num++
            mBinding.mainTextNumber.text = num.toString()
        }
    }
}