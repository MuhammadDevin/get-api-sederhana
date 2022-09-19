package com.muhammaddevin.android.get_api_sederhana.data

import com.google.gson.annotations.SerializedName

data class User(

	@field:SerializedName("UserItem")
	val userItem: List<UserItem?>? = null
)