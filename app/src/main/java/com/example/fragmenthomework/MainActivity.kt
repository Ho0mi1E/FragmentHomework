package com.example.fragmenthomework

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmenthomework.fragment.LoginFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openFragment(LoginFragment.newInstance(), R.id.container, LoginFragment.TAG)
    }
}
