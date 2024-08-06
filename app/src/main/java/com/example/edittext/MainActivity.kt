package com.example.edittext

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.edittext.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
     super.onCreate(savedInstanceState)

        val binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val resultText=binding.result
        val qushish=binding.qushish
        qushish.setOnClickListener{
            val a =binding.sonBir.text.toString().toInt()
            val b =binding.sonIkki.text.toString().toInt()
            val c=a+b
            resultText.setText(c.toString())
            }

    }
}