package com.swapi;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Planet implements Serializable{

    private String name;
    @SerializedName("rotation_period")
    private String rotationPeriod;
    @SerializedName("orbital_period")
    private String orbitalPeriod;
    private String diameter;
    private String climate;
    private String gravity;
    private String terrain;
    @SerializedName("surface_water")
    private String surfaceWater;
    private String population;
    private List<String> residents;
    private List<String> films;
    private String created;
    private String edited;
    private String url;
    
	public Planet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Planet(String name, String rotationPeriod, String orbitalPeriod, String diameter, String climate,
			String gravity, String terrain, String surfaceWater, String population, List<String> residents,
			List<String> films, String created, String edited, String url) {
		super();
		this.name = name;
		this.rotationPeriod = rotationPeriod;
		this.orbitalPeriod = orbitalPeriod;
		this.diameter = diameter;
		this.climate = climate;
		this.gravity = gravity;
		this.terrain = terrain;
		this.surfaceWater = surfaceWater;
		this.population = population;
		this.residents = residents;
		this.films = films;
		this.created = created;
		this.edited = edited;
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRotationPeriod() {
		return rotationPeriod;
	}
	public void setRotationPeriod(String rotationPeriod) {
		this.rotationPeriod = rotationPeriod;
	}
	public String getOrbitalPeriod() {
		return orbitalPeriod;
	}
	public void setOrbitalPeriod(String orbitalPeriod) {
		this.orbitalPeriod = orbitalPeriod;
	}
	public String getDiameter() {
		return diameter;
	}
	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}
	public String getClimate() {
		return climate;
	}
	public void setClimate(String climate) {
		this.climate = climate;
	}
	public String getGravity() {
		return gravity;
	}
	public void setGravity(String gravity) {
		this.gravity = gravity;
	}
	public String getTerrain() {
		return terrain;
	}
	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}
	public String getSurfaceWater() {
		return surfaceWater;
	}
	public void setSurfaceWater(String surfaceWater) {
		this.surfaceWater = surfaceWater;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	public List<String> getResidents() {
		return residents;
	}
	public void setResidents(List<String> residents) {
		this.residents = residents;
	}
	public List<String> getFilms() {
		return films;
	}
	public void setFilms(List<String> films) {
		this.films = films;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getEdited() {
		return edited;
	}
	public void setEdited(String edited) {
		this.edited = edited;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Planet [name=" + name + ", rotationPeriod=" + rotationPeriod + ", orbitalPeriod=" + orbitalPeriod
				+ ", diameter=" + diameter + ", climate=" + climate + ", gravity=" + gravity + ", terrain=" + terrain
				+ ", surfaceWater=" + surfaceWater + ", population=" + population + ", residents=" + residents
				+ ", films=" + films + ", created=" + created + ", edited=" + edited + ", url=" + url + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((climate == null) ? 0 : climate.hashCode());
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + ((diameter == null) ? 0 : diameter.hashCode());
		result = prime * result + ((edited == null) ? 0 : edited.hashCode());
		result = prime * result + ((films == null) ? 0 : films.hashCode());
		result = prime * result + ((gravity == null) ? 0 : gravity.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((orbitalPeriod == null) ? 0 : orbitalPeriod.hashCode());
		result = prime * result + ((population == null) ? 0 : population.hashCode());
		result = prime * result + ((residents == null) ? 0 : residents.hashCode());
		result = prime * result + ((rotationPeriod == null) ? 0 : rotationPeriod.hashCode());
		result = prime * result + ((surfaceWater == null) ? 0 : surfaceWater.hashCode());
		result = prime * result + ((terrain == null) ? 0 : terrain.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planet other = (Planet) obj;
		if (climate == null) {
			if (other.climate != null)
				return false;
		} else if (!climate.equals(other.climate))
			return false;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (diameter == null) {
			if (other.diameter != null)
				return false;
		} else if (!diameter.equals(other.diameter))
			return false;
		if (edited == null) {
			if (other.edited != null)
				return false;
		} else if (!edited.equals(other.edited))
			return false;
		if (films == null) {
			if (other.films != null)
				return false;
		} else if (!films.equals(other.films))
			return false;
		if (gravity == null) {
			if (other.gravity != null)
				return false;
		} else if (!gravity.equals(other.gravity))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (orbitalPeriod == null) {
			if (other.orbitalPeriod != null)
				return false;
		} else if (!orbitalPeriod.equals(other.orbitalPeriod))
			return false;
		if (population == null) {
			if (other.population != null)
				return false;
		} else if (!population.equals(other.population))
			return false;
		if (residents == null) {
			if (other.residents != null)
				return false;
		} else if (!residents.equals(other.residents))
			return false;
		if (rotationPeriod == null) {
			if (other.rotationPeriod != null)
				return false;
		} else if (!rotationPeriod.equals(other.rotationPeriod))
			return false;
		if (surfaceWater == null) {
			if (other.surfaceWater != null)
				return false;
		} else if (!surfaceWater.equals(other.surfaceWater))
			return false;
		if (terrain == null) {
			if (other.terrain != null)
				return false;
		} else if (!terrain.equals(other.terrain))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}
    
	
}
