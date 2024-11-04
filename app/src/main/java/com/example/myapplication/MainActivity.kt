package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.homeTv.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.container,Homefragment(),null)
                .commit()

        }
        binding.settingTv.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.container,SettingFragment(),null)
                .commit()
        }





        //setContentView(R.layout.activity_main)


    }
}