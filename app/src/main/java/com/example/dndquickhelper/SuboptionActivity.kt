package com.example.dndquickhelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_suboption.*

class SuboptionActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suboption)

        subopt_return_btn.setOnClickListener(this)
        subopt1.setOnClickListener(this)
        subopt2.setOnClickListener(this)
        subopt3.setOnClickListener(this)
        subopt4.setOnClickListener(this)
        subopt5.setOnClickListener(this)
        subopt6.setOnClickListener(this)
        subopt7.setOnClickListener(this)
        subopt8.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        var intent = Intent(this, SuboptionContentActivity::class.java)
        startActivity(intent)

        when (view!!.id) {
            R.id.subopt_return_btn -> {
                intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}