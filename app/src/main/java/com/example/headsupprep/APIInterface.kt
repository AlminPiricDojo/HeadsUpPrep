package com.example.headsupprep

import com.example.headsupprep.model.Celebrity
import retrofit2.Call
import retrofit2.http.*

interface APIInterface {
    @Headers("Content-Type: application/json")
    @GET("/celebrities/")
    fun getCelebrities(): Call<ArrayList<Celebrity>>

    @Headers("Content-Type: application/json")
    @POST("/celebrities/")
    fun addCelebrity(@Body celebrityData: Celebrity): Call<Celebrity>

    @Headers("Content-Type: application/json")
    @GET("/celebrities/{id}")
    fun getCelebrity(@Path("id") id: Int): Call<Celebrity>

    // PUT replaces the full object (use PATCH to change individual fields)
    @Headers("Content-Type: application/json")
    @PUT("/celebrities/{id}")
    fun updateCelebrity(@Path("id") id: Int, @Body celebrityData: Celebrity): Call<Celebrity>

    @Headers("Content-Type: application/json")
    @DELETE("/celebrities/{id}")
    fun deleteCelebrity(@Path("id") id: Int): Call<Void>
}