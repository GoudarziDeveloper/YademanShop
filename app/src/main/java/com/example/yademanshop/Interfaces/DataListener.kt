package com.example.yademanshop.Interfaces

interface DataListener<N> {
    fun onSuccess(data:N)

    fun onError(error:Throwable)
}