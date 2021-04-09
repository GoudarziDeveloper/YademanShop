package com.example.yademanshop.`ّFragments`

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.yademanshop.Interfaces.DataListener
import com.example.yademanshop.Models.User
import com.example.yademanshop.R
import com.example.yademanshop.Tables.UserPresenter
import kotlinx.android.synthetic.main.login_fragment.*

class LoginFragment():Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.login_fragment , container , false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        login_btnLogin.setOnClickListener {
            UserPresenter(object : DataListener<List<User>> {
                override fun onSuccess(data: List<User>) {
                    Toast.makeText(context , data[0].user_display_name , Toast.LENGTH_LONG).show()
                }

                override fun onError(error: Throwable) {
                    Toast.makeText(context , error.toString() , Toast.LENGTH_LONG).show()
                }
            }).userData(login_username.text.toString() , login_password.text.toString())
        }
    }
}