package com.example.fragmenthomework.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.fragmenthomework.R
import com.example.fragmenthomework.user.User
import kotlinx.android.synthetic.main.show_user_secret.*


class Secret : Fragment(R.layout.show_user_secret) {
    companion object {
        const val TAG = "SECRET"
        val key = "Key"

        fun newInstance(user: User?) = Secret().apply {
            arguments = Bundle().apply { putParcelable(key, user) }
        }



    }

    private val user: User? by lazy { arguments?.getParcelable(key) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        secret.text = user?.toString()

    }




    }
