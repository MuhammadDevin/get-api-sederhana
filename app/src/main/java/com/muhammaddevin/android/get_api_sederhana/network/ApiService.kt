package com.muhammaddevin.android.get_api_sederhana.network

import com.muhammaddevin.android.get_api_sederhana.data.UserItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface ApiService {
    @GET("users")
    @Headers("Authorization: token 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")
    fun getListUser() : Call<ArrayList<UserItem>>
}