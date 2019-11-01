package com.example.responsi_078

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val nama = findViewById<EditText>(R.id.tx_nm)
        val username = findViewById<EditText>(R.id.tx_us)
        val password = findViewById<EditText>(R.id.tx_pas)

        daftar.setOnClickListener() {
            val Nama = nama.text.toString()
            val Username = username.text.toString()
            val Password = password.text.toString()

            val intent = Intent(this, AccountActivity::class.java)
            intent.putExtra("nama", Nama)
            intent.putExtra("username", Username)
            intent.putExtra("password", Password)
            startActivity(intent)
        }
    }
}
