package com.example.uicustomviews

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.uicustomviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding
    private var num = 0
    private final val keyNum = "keyNum"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        num = getSharedPreferences("data", Context.MODE_PRIVATE).getInt(keyNum, 0)
        mBinding.mainTextNumber.text = num.toString()

        mBinding.titleLayout.setTitle("首页")

        mBinding.titleLayout.setEditOnClickListener {
            Toast.makeText(this, "点击了编辑按钮", Toast.LENGTH_LONG).show()
        }

        mBinding.mainBtnAdd1.setOnClickListener {
            num++
            mBinding.mainTextNumber.text = num.toString()
            save()
        }
    }

    private fun save() = getSharedPreferences("data", Context.MODE_PRIVATE).edit().apply { putInt(keyNum, num) }.apply()
}