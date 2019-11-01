package com.example.responsi_078

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val username = findViewById<EditText>(R.id.tx_user)
        val password = findViewById<EditText>(R.id.tx_pass)

        masuk.setOnClickListener(){
            if (username.text.toString()== "Sd" && password.text.toString()== "sd"){
                intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(applicationContext,"Coba Lagi Loginnya ya!!",Toast.LENGTH_LONG)
                    .show()
            }
        }
    }
}
