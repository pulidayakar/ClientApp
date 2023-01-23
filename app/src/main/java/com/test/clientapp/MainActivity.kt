package com.test.clientapp

import android.content.ActivityNotFoundException
import android.content.Intent
import android.content.Intent.*
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import com.test.clientapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val messageInfo: Bundle? by lazy {
        intent.getBundleExtra(BUNDLE_INFO)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        handleIntentData()
    }

    private fun handleIntentData() {
        messageInfo?.let {
            binding.tvMessage.text = it.getString(MESSAGE)
        }
    }

}