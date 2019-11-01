package com.example.responsi_078

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

 class ListAdapter(private val listFoto: ArrayList<Foto>): RecyclerView.Adapter<ListAdapter.FotoViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FotoViewHolder {
            val view: View =
                LayoutInflater.from(parent.context).inflate(R.layout.item_foto, parent, false)
            return FotoViewHolder(view)
        }

        override fun getItemCount(): Int {
            return listFoto.size
        }

        override fun onBindViewHolder(holder: FotoViewHolder, position: Int) {
            val foto = listFoto[position]
            holder.tvName.text = foto.name
            holder.tvDetail.text = foto.detail
            Glide.with(holder.itemView.context).load(foto.poster).into(holder.imgPoster)

            holder.itemView.setOnClickListener {
                Toast.makeText(
                    holder.itemView.context,
                    "Pilihan Anda " + listFoto[holder.adapterPosition].name,
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        inner class FotoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
            var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
            var imgPoster: ImageView = itemView.findViewById(R.id.img_item_poster)
        }
    }
