package com.example.fragmenthomework

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmenthomework.fragment.Login



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openFragment(Login.newInstance(), R.id.container,Login.TAG)




    }




    }










