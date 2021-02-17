package com.example.demo.model;

import okhttp3.OkHttpClient;
import org.springframework.stereotype.Service;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Service
public class MovieServiceGenerator {

    private static final String BASE_URL = "https://api.themoviedb.org/3/";

    private static Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = builder.build();

//    private static OkHttpClient.Builder httpClient
//            = new OkHttpClient.Builder();

    public static <S> S createService (Class<S> serviceClass) {
        return retrofit.create(serviceClass);
    }
}
