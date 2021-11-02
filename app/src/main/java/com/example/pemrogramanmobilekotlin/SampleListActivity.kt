package com.example.pemrogramanmobilekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SampleListActivity : AppCompatActivity() {
    lateinit var btnList : Button
    lateinit var btnRecycler : Button
    lateinit var btnCard : Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_list)

        btnList= findViewById(R.id.btn_show_list)
        btnRecycler= findViewById(R.id.btn_sample_RV)
        btnCard= findViewById(R.id.rvCardView)

        btnList.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var intent = Intent(this@SampleListActivity, SampleListView::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })

        btnRecycler.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var intent = Intent(this@SampleListActivity, SampleRecyclerView::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })

        btnCard.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var intent = Intent(this@SampleListActivity, SampleCardView::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })
    }
}