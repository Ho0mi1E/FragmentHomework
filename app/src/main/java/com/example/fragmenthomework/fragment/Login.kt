package com.example.fragmenthomework.fragment


import androidx.core.text.isDigitsOnly
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.fragmenthomework.MainActivity
import com.example.fragmenthomework.R
import com.example.fragmenthomework.openFragment
import com.example.fragmenthomework.showToast
import com.example.fragmenthomework.user.User
import kotlinx.android.synthetic.main.login.*
import kotlinx.android.synthetic.main.user.*


class Login : Fragment(R.layout.login) {
    companion object {
        const val TAG = "LOGIN"
        fun newInstance() = Login()
    }



}