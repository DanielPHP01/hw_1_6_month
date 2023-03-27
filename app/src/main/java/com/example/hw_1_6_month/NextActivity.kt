package com.example.hw_1_6_month

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hw_1_6_month.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListener()
    }

    private fun initListener() {
        binding.etNext.setText(intent.getStringExtra("text_main"))
        binding.btnNext.setOnClickListener {
            intent.putExtra("text_next", binding.etNext.text.toString())
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}