package com.fabscorp.motivation.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.fabscorp.motivation.infra.MotivationConstants
import com.fabscorp.motivation.R
import com.fabscorp.motivation.infra.SecurityPreferences
import com.fabscorp.motivation.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var bidding: ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bidding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(bidding.root)

        bidding.buttonSave.setOnClickListener(this)
        supportActionBar?.hide()
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button_save) {
            handleSave();
        }
    }

    private fun handleSave() {
        val name = bidding.editName.text.toString()

        if (name != "") {
            SecurityPreferences(this).storeString(MotivationConstants.KEY.USER_NAME, name)
            finish() //To destroy UserActivity
        } else {
            Toast.makeText(this, R.string.validation_mandatory_name, Toast.LENGTH_SHORT).show()
        }
    }
}