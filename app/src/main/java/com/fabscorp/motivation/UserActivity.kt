package com.fabscorp.motivation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fabscorp.motivation.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {
    private lateinit var bidding: ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bidding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(bidding.root)

        supportActionBar?.hide()
    }
}