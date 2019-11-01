package com.example.responsi_078

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.responsi_078.R


class HomeActivity : AppCompatActivity() {

    private lateinit var  rvFoto:RecyclerView
    private var list:ArrayList<Foto> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
            rvFoto = findViewById(R.id.rv_foto)
            rvFoto.setHasFixedSize(true)
            list.addAll(FotoData.listFoto)
            showFotoList()
        }
        private fun showFotoList() {
            rvFoto.layoutManager = LinearLayoutManager(this)
            val listfotoadapter = ListAdapter(list)
            rvFoto.adapter = listfotoadapter

    }
}
