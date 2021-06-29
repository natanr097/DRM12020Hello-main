package com.example.drm12020hello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ActionMode
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // MEU CÓDIGO

        btnOk.setOnClickListener {


            val nome = edtNome.text.toString()


            val i = Intent(this, Tela2::class.java)

            i.putExtra("nome digitado",nome)

            startActivity(i)
            }
        }

    override fun onResume() {
        super.onResume()
        edtNome.text.clear()
    }

}