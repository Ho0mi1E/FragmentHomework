package com.example.fragmenthomework.fragment


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.fragmenthomework.R
import com.example.fragmenthomework.openFragment
import com.example.fragmenthomework.showToast
import com.example.fragmenthomework.user.User
import kotlinx.android.synthetic.main.login.*


class LoginFragment : Fragment(R.layout.login) {
    companion object {
        const val TAG = "LOGIN"
        fun newInstance() = LoginFragment()


    }

    private fun putData() {
        btn.setOnClickListener {
            if (name.text.isEmpty() || email.text.isEmpty() || password.text.isEmpty())
                requireActivity().showToast("кек")
            else {

                val user =
                    User(name.text.toString(), email.text.toString(), password.text.toString())
                requireActivity().openFragment(
                    JustNameFragment.newInstance(user),
                    R.id.container,
                    JustNameFragment.TAG
                )
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        putData()
    }


}




