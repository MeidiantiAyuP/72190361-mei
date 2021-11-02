package com.example.pemrogramanmobilekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pemrogramanmobilekotlin.adapter.PetaniCVAdapter
import com.example.pemrogramanmobilekotlin.model.Petani

class SampleCardView : AppCompatActivity() {
    lateinit var cv: CardView
    lateinit var layoutManager: LinearLayoutManager
    lateinit var adapter: PetaniCVAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_card_view)

        cv = findViewById(R.id.cvLatihan)

        val listPetani = listOf(
            Petani(
                user = "MAP",
                nama = "Meidianti Ayu Permatasari",
                jumlahLahan = "100",
                identifikasi = "200",
                tambahLahan = "300"),
            Petani(
                user = "MAP1",
                nama = "Meidianti Ayu Permatasari",
                jumlahLahan = "100",
                identifikasi = "200",
                tambahLahan = "300"),
            Petani(
                user = "MAP2",
                nama = "Meidianti Ayu Permatasari",
                jumlahLahan = "100",
                identifikasi = "200",
                tambahLahan = "300"),
            Petani(
                user = "MAP3",
                nama = "Meidianti Ayu Permatasari",
                jumlahLahan = "100",
                identifikasi = "200",
                tambahLahan = "300")
        )

        val petaniCVAdapter = PetaniCVAdapter(listPetani)

        cv.apply {
            layoutManager = LinearLayoutManager(this@SampleCardView)
            adapter = petaniCVAdapter
        }
    }
    }
