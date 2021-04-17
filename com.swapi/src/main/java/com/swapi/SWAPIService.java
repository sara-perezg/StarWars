package com.swapi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface SWAPIService {

	@GET("people/{id}/")
	public Call<People> getPeople(@Path("id") int peopleId);
	
	@GET("people/")
    public Call<SWModelList<People>> getAllPeople();
	
	@GET("starships/{id}/")
	public Call<Starship> getStarships(@Path("id") int starshipId);
	
	@GET("starships/")
    public Call<SWModelList<Starship>> getAllStarships();

	@GET("planets/{id}/")
	public Call<Planet> getPlanets(@Path("id") int planetId);
	
	@GET("planets/")
	public Call<SWModelList<Planet>> getAllPlanets();
}