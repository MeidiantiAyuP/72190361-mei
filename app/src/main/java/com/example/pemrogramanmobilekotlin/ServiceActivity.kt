package com.example.pemrogramanmobilekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ServiceActivity : AppCompatActivity() {
    lateinit var btnGet : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)
        btnGet = findViewById(R.id.btnGetAPI)

        btnGet.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var intent = Intent(this@ServiceActivity, GetAPIActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })
    }
}