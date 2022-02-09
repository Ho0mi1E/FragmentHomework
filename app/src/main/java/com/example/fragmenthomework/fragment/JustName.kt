package com.example.fragmenthomework.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.fragmenthomework.R
import com.example.fragmenthomework.openFragment
import com.example.fragmenthomework.user.User
import kotlinx.android.synthetic.main.user.*

class JustName : Fragment(R.layout.user) {
    companion object {
        const val TAG = "USERNAME"
         const val USER_KEY = "tobi"
        fun newInstance(user: User) = JustName() .apply {
            arguments = Bundle().apply { putParcelable(USER_KEY, user) }
        }



    }
    private fun showYourSecret(){

        imagine.setOnClickListener {
            requireActivity().openFragment(Secret.newInstance(user),R.id.container,Secret.TAG)

        }
    }

    private val user: User? by lazy { arguments?.getParcelable(USER_KEY) }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showYourSecret()
        justUser.text = user?.name
    }
}