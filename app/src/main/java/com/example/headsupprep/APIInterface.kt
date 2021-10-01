package com.example.headsupprep

import com.example.headsupprep.model.Celebrity
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface APIInterface {
    @Headers("Content-Type: application/json")
    @GET("/celebrities/")
    fun getCelebrities(): Call<ArrayList<Celebrity>>

    @Headers("Content-Type: application/json")
    @POST("/celebrities/")
    fun addCelebrity(@Body celebrityData: Celebrity): Call<Celebrity>
}