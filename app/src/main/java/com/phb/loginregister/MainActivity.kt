package com.phb.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login.setOnClickListener {

            //berpindah activity Intent(activity-saat-ini, activity-tujuan)
            val go = Intent(this@MainActivity, Login::class.java)

            //menjalankan intent
            startActivity(go)
        }

        register.setOnClickListener {
            val go = Intent(this@MainActivity, Register::class.java)
            startActivity(go)
        }
    }
}