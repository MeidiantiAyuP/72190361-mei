package com.example.pemrogramanmobilekotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pemrogramanmobilekotlin.R
import com.example.pemrogramanmobilekotlin.model.Petani

class PetaniCVAdapter(val petani: List<Petani>): RecyclerView.Adapter<PetaniCVAdapter.PetaniHolder>() {
 override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetaniCVAdapter.PetaniHolder {
  return PetaniHolder(LayoutInflater.from(parent.context).inflate(R.layout.cv_item_petani, parent, false))
 }

 override fun onBindViewHolder(holder: PetaniCVAdapter.PetaniHolder, position: Int) {
  holder.bindPetani(petani[position])
 }

 override fun getItemCount(): Int {
  return petani.size
 }
 class PetaniHolder(view: View) : RecyclerView.ViewHolder(view) {
  lateinit var txtUserCV: TextView
  lateinit var txtNameCV: TextView
  lateinit var txtJumlahLahanCV: TextView
  lateinit var txtIdentifikasiCV: TextView
  lateinit var txtTambahLahanCV: TextView
  fun bindPetani(petani: Petani) {
   itemView.apply {
    txtUserCV = findViewById(R.id.txtUserCV)
    txtNameCV = findViewById(R.id.txtNameCV)
    txtJumlahLahanCV = findViewById(R.id.txtJumlahLahanCV)
    txtIdentifikasiCV = findViewById(R.id.txtIdentifikasiCV)
    txtTambahLahanCV = findViewById(R.id.txtTambahLahanCV)
    txtUserCV.text = petani.user
    txtNameCV.text = petani.nama
    txtJumlahLahanCV.text = petani.jumlahLahan
    txtIdentifikasiCV.text = petani.identifikasi
    txtTambahLahanCV.text = petani.tambahLahan
   }
  }
 }
}
