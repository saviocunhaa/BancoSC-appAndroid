package com.example.bancosc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bancosc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {




    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.imgSaldo.setOnClickListener {
            val intent = Intent(this, Saldo::class.java)
            startActivity(intent)
        }

        binding.imgFatura.setOnClickListener {
            val intent = Intent(this, Fatura::class.java)
            startActivity(intent)
        }

        binding.imgPoupanca.setOnClickListener {
            val intent = Intent(this, Poupanca::class.java)
            startActivity(intent)
        }

        binding.imgTransferencia.setOnClickListener {
            val intent = Intent(this, Transferencia::class.java)
            startActivity(intent)
        }
    }
}