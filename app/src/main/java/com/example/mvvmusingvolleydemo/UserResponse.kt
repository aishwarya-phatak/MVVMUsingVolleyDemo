package com.example.mvvmusingvolleydemo

import com.google.gson.annotations.SerializedName

data class UserResponse (
    @SerializedName("page")
    var pageNumber : Int,

    @SerializedName("per_page")
    var usersPerPage : Int,

    @SerializedName("total")
    var userCount : Int,

    @SerializedName("total_pages")
    var totalPages : Int = 0,

    @SerializedName("data")
    var users : ArrayList<User>
        ) {
    override fun toString(): String {
        return "page = $pageNumber"
    }
}