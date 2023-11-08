package com.fabscorp.motivation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.fabscorp.motivation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        handleUserName()

        binding.buttonNewPhrase.setOnClickListener(this)


    }

    private fun handleUserName() {
        val name =  SecurityPreferences (this).getString(MotivationConstants.KEY.USER_NAME)
        binding.textUserName.text = "Olá, $name!"
    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_new_phrase) {
            var s= "String"

        }
    }
}