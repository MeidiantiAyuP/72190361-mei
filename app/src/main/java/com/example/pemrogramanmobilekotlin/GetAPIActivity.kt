package com.example.pemrogramanmobilekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pemrogramanmobilekotlin.adapter.UsersAdapter
import com.example.pemrogramanmobilekotlin.model.ResponseUsersItem
import com.example.pemrogramanmobilekotlin.network.NetworkConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class GetAPIActivity : AppCompatActivity() {
    lateinit var rvUserAPI: RecyclerView
    lateinit var layoutManager: LinearLayoutManager
    lateinit var adapter: UsersAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        rvUserAPI = findViewById(R.id.rvUserAPI)


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_apiactivity)

        NetworkConfig().getService().getUsers().enqueue(object : Callback<List<ResponseUsersItem>> {
                override fun onFailure(call: Call<List<ResponseUsersItem>>, t:
                Throwable) {
                    Toast.makeText(this@GetAPIActivity, t.localizedMessage, Toast.LENGTH_SHORT).show() }
                override fun onResponse(
                    call: Call<List<ResponseUsersItem>>, response: Response<List<ResponseUsersItem>>
                ) {

                    rvUserAPI.apply{
                        layoutManager = LinearLayoutManager(this@GetAPIActivity)
                        adapter = UsersAdapter(response.body())
                    }
                }
            })
    }
}