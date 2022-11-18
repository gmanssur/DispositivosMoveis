package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnProsseguir.setOnClickListener {prosseguir()}
    }

    private fun prosseguir() {

        val nome = binding.editNome.text.toString()

        val intent = Intent(this, SecondActivity:: class.java)
        intent.putExtra("nome", nome)
        startActivity(intent)

    }
}

