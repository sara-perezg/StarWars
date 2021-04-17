package com.swapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
//import okhttp3.OkHttpClient;
import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Callback;
import retrofit2.Response;
public class Main {

	public static void main(String[] args) throws IOException{
		
		final String BASE_URL = "https://swapi.dev/api/";
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl(BASE_URL)
				.addConverterFactory(GsonConverterFactory.create())
				.build();
		
		SWAPIService swapiService = retrofit.create(SWAPIService.class);
		
		Call<People> call = swapiService.getPeople(3);
		
		call.enqueue(new Callback<People>() {

			@Override
			public void onResponse(Call<People> call, Response<People> response) {
				// TODO Auto-generated method stub
				People people = response.body();
				System.out.println(people);
			}

			@Override
			public void onFailure(Call<People> call, Throwable t) {
				// TODO Auto-generated method stub
				t.printStackTrace();
			}
			
		});	

	}
}
