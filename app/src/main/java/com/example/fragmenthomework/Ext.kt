package com.example.fragmenthomework

import android.app.Activity
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

fun Activity.showToast(message: String){
    Toast.makeText(this,message,Toast.LENGTH_LONG).show()

}

fun FragmentActivity.openFragment(fragment: Fragment, id: Int,tag:String){
    supportFragmentManager
        .beginTransaction()
        .replace(id, fragment, tag)
        .addToBackStack(tag)
        .commit()
}