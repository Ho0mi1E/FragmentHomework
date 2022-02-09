package com.example.fragmenthomework

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmenthomework.fragment.JustName
import com.example.fragmenthomework.fragment.Login
import kotlinx.android.synthetic.main.login.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openFragment(Login.newInstance(), R.id.container,Login.TAG)


    }


    override fun onStart() {
        super.onStart()
        initViews()


    }

    private fun initViews(){
        btn.setOnClickListener {
            if (name.text.isEmpty() || email.text.isEmpty() || password.text.isEmpty() )
                showToast("кек")
            else
            {
                JustName.newInstance().requireActivity().openFragment(JustName.newInstance(),R.id.container,JustName.TAG)
            }

        }




            }
        }








