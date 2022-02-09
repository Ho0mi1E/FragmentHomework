package com.example.fragmenthomework.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragmenthomework.R
import com.example.fragmenthomework.user.User

class JustName : Fragment(R.layout.user) {
    companion object {
        const val TAG = "JUSTNAME"
        private const val USER_KEY = "tobi"
        fun newInstance() = JustName()

    }
}