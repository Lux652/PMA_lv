package com.example.student.lv.Network;


import com.example.student.lv.Models.CoursesResponse;

import retrofit2.Call;
import retrofit2.http.GET;


public interface UdacityAPI {
    @GET("/public-api/v0/courses")
    Call<CoursesResponse> getCourses();
}