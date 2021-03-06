package com.swapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
//import okhttp3.OkHttpClient;
import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Callback;
//import retrofit2.Response;
public class Main {

	public static void main(String[] args) throws IOException{
		
		final String BASE_URL = "https://swapi.dev/api/";
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl(BASE_URL)
				.addConverterFactory(GsonConverterFactory.create())
				.build();
		
		SWAPIService swapiService = retrofit.create(SWAPIService.class);
		
		
		int page = 1;
		String name = "Luke";
		String hasNext = "";
		
		while (!hasNext.equals("null")) {
			
		Call<SWAPIList<People>> call = swapiService.getPeopleByName(name, page);
		
			call.enqueue(new Callback<SWAPIList<People>>() {
	
				@Override
				public void onResponse(Call<SWAPIList<People>> call, Response<SWAPIList<People>> response) {
					// TODO Auto-generated method stub
					try {
						SWAPIList<People> people = response.body();
						String hasNext = people.getNext();
						System.out.println(hasNext);
						System.out.println(people);
					} catch (NullPointerException e) {
						// TODO: handle exception
					}
				}
				@Override
				public void onFailure(Call<SWAPIList<People>> call, Throwable t) {
					// TODO Auto-generated method stub
					t.printStackTrace();
				}
			});	
			page++;
		}

	}
}
