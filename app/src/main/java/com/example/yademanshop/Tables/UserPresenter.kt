package com.example.yademanshop.Tables

import com.example.yademanshop.Interfaces.ApiServices
import com.example.yademanshop.Interfaces.DataListener
import com.example.yademanshop.LoginData
import com.example.yademanshop.Models.User
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class UserPresenter(private val mListener: DataListener<List<User>>) {
    private val api = ApiServices()

    fun userData(username:String , password:String){
        api
                .getApi()
                .getUsers(LoginData(username , password))
                .enqueue(object : retrofit2.Callback<List<User>> {
                    override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
                        val data = response.body()
                        if (data != null){
                            mListener.onSuccess(data)
                        }
                    }

                    override fun onFailure(call: Call<List<User>>, t: Throwable) {
                        mListener.onError(t)
                    }
                })
    }
}