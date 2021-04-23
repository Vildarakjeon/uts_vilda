package com.vildarezaardiantykusuma.uts_vilda.service;

import com.vildarezaardiantykusuma.uts_vilda.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("/users")
    Call<List<User>> getUsersList();
}

