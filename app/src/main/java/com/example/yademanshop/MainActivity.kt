package com.example.yademanshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.yademanshop.Interfaces.DataListener
import com.example.yademanshop.Models.User
import com.example.yademanshop.Tables.UserPresenter
import com.example.yademanshop.`ّFragments`.CartFragment
import com.example.yademanshop.`ّFragments`.InterestsFragment
import com.example.yademanshop.`ّFragments`.LoginFragment
import com.example.yademanshop.`ّFragments`.ShopFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.layoutDirection = View.LAYOUT_DIRECTION_RTL
        replaceFragment(LoginFragment())
        BNV_Main.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.shopFragment -> {
                    replaceFragment(ShopFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.interestFragment -> {
                    replaceFragment(InterestsFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.cartFragment -> {
                    replaceFragment(CartFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.profileFragment -> {
                    replaceFragment(LoginFragment())
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.switcherFragment , fragment)
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
        fragmentTransaction.commit()
    }
}