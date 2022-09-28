package com.example.dndquickhelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_selected_content_info.*

class SelectedContentInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_content_info)

        selected_content_return_btn.setOnClickListener {
            val intent = Intent(this, SuboptionContentActivity::class.java)
            startActivity(intent)
        }
    }
}