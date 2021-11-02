package com.example.pemrogramanmobilekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvMain : TextView
    lateinit var btnInputNama : Button
    lateinit var edInputNama : EditText
    lateinit var btnHelp : Button
    lateinit var btnLinear : Button
    lateinit var btnConstraint : Button
    lateinit var btnTable : Button
    lateinit var btnProtein : Button
    lateinit var btnDuta : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvMain = findViewById(R.id.tv_main_activity)
        tvMain.text = getString(R.string.text_progmob_main)
        btnHelp = findViewById(R.id.btn_help)
        btnLinear = findViewById(R.id.btn_linear)
        btnConstraint = findViewById(R.id.btn_constraint)
        btnTable = findViewById(R.id.btn_table)
        btnProtein = findViewById(R.id.btn_protein)
        btnDuta = findViewById(R.id.btn_dutatani)

        btnInputNama = findViewById(R.id.btn_ambil_name)
        edInputNama = findViewById(R.id.ed_input_name)

        btnInputNama.setOnClickListener(View.OnClickListener {
            var strTmp = edInputNama.text.toString()
            tvMain.text = strTmp
        })
        btnHelp.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var strTmp = edInputNama.text.toString()
            bundle.putString("tesText",strTmp)

            var intent = Intent(this@MainActivity, HelpActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })

        btnLinear.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var strTmp = edInputNama.text.toString()
            bundle.putString("tesText",strTmp)

            var intent = Intent(this@MainActivity, LinearActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })

        btnConstraint.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var strTmp = edInputNama.text.toString()
            bundle.putString("tesText",strTmp)

            var intent = Intent(this@MainActivity, ConstraintActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })

        btnTable.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var strTmp = edInputNama.text.toString()
            bundle.putString("tesText",strTmp)

            var intent = Intent(this@MainActivity, TableActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })

        btnProtein.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var intent = Intent(this@MainActivity, ProteinTrackerActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })

        btnDuta.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var intent = Intent(this@MainActivity, DutataniActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })
    }
}