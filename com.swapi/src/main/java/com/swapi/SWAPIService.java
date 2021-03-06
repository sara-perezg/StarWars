package com.swapi;

import retrofit2.Call;
//import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface SWAPIService {

	
	
	@GET("people/{id}/")
	public Call<People> getPeople(@Path("id") int peopleId);
	
	@GET("people/")
	public Call<SWAPIList<People>> getPeopleByName(@Query("search") String name, @Query("page") int page);
	
	@GET("people/")
    public Call<SWAPIList<People>> getAllPeople(@Query("page") int page);
	
	@GET("starships/{id}/")
	public Call<Starship> getStarships(@Path("id") int starshipId);
	
	@GET("starships/")
    public Call<SWAPIList<Starship>> getAllStarships(@Query("page") int page);

	@GET("planets/{id}/")
	public Call<Planet> getPlanets(@Path("id") int planetId);
	
	@GET("planets/")
	public Call<SWAPIList<Planet>> getAllPlanets(@Query("page") int page);
}
