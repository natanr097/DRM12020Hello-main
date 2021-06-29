package com.example.drm12020hello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tela2.*

class Tela2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        // MEU CÓDIGO

        val i = intent

        val nome = i.getStringExtra("nome digitado")

        txtBoasVindas.text = "Olá "+ nome + ", Seja bem vindo!"




    }
}