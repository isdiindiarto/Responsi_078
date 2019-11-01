package com.example.responsi_078

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.account.*

class AccountActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.account)

        val bundle = intent.extras
        val nama = bundle?.get("nama")
        val username = bundle?.get("username")
        val password = bundle?.get("password")

        tx_nm.text=("Nama: "+("nama"))
        tx_nm.text=("Username: "+("username"))
        tx_nm.text=("Password: "+("password"))

    }
}