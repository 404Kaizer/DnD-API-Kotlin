package com.example.dndquickhelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_suboption.*
import kotlinx.android.synthetic.main.activity_suboption_content.*

class SuboptionContentActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suboption_content)

        content_return_btn.setOnClickListener(this)
        content1.setOnClickListener(this)
        content2.setOnClickListener(this)
        content3.setOnClickListener(this)
        content4.setOnClickListener(this)
        content5.setOnClickListener(this)
        content6.setOnClickListener(this)
        content7.setOnClickListener(this)
        content8.setOnClickListener(this)
        content9.setOnClickListener(this)
        content10.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        var intent = Intent(this, SelectedContentInfoActivity::class.java)
        startActivity(intent)

        when (view!!.id) {
            R.id.content_return_btn -> {
                intent = Intent(this, SuboptionActivity::class.java)
                startActivity(intent)
            }
        }
    }
}