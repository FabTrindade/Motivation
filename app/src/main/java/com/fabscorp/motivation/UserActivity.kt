package com.fabscorp.motivation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.fabscorp.motivation.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity(), View.OnClickListener{
    private lateinit var bidding: ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bidding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(bidding.root)

        bidding.buttonSave.setOnClickListener(this)
        supportActionBar?.hide()
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button_save){
        }
    }
}