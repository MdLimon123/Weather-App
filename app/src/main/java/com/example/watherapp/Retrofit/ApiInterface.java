package com.example.watherapp.Retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("weather?appid=adf8fad1c94ad70d886b23dd439e5ac9&units=metric")
    Call<Example> getWeatherData(@Query("q") String name);

  }
