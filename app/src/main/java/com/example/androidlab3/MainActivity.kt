package com.example.androidlab3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidlab3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityMainBinding.inflate(layoutInflater).root)
    }
}