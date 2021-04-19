package com.swapi;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class People implements Serializable{

	private String name;
    @SerializedName("birth_year")
	private String birthYear;
	private List<String> films;
	private String gender;
    @SerializedName("hair_color")
	private String hairColor;
	private String height;
	private String homeworld;
	private String mass;
	@SerializedName("skin_color")
	private String skinColor;
	private String created;
	private String edited;
	private String url;
	private List<String> species;
	private List<String> starships;
	private List<String> vehicles;
	
	public People() {
		super();
		// TODO Auto-generated constructor stub
	}
	public People(String name, String birthYear, List<String> films, String gender, String hairColor, String height,
			String homeworld, String mass, String skinColor, String created, String edited, String url,
			List<String> species, List<String> starships, List<String> vehicles) {
		super();
		this.name = name;
		this.birthYear = birthYear;
		this.films = films;
		this.gender = gender;
		this.hairColor = hairColor;
		this.height = height;
		this.homeworld = homeworld;
		this.mass = mass;
		this.skinColor = skinColor;
		this.created = created;
		this.edited = edited;
		this.url = url;
		this.species = species;
		this.starships = starships;
		this.vehicles = vehicles;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}
	public List<String> getFilms() {
		return films;
	}
	public void setFilms(List<String> films) {
		this.films = films;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHairColor() {
		return hairColor;
	}
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getHomeworld() {
		return homeworld;
	}
	public void setHomeworld(String homeworld) {
		this.homeworld = homeworld;
	}
	public String getMass() {
		return mass;
	}
	public void setMass(String mass) {
		this.mass = mass;
	}
	public String getSkinColor() {
		return skinColor;
	}
	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
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
	public List<String> getSpecies() {
		return species;
	}
	public void setSpecies(List<String> species) {
		this.species = species;
	}
	public List<String> getStarships() {
		return starships;
	}
	public void setStarships(List<String> starships) {
		this.starships = starships;
	}
	public List<String> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<String> vehicles) {
		this.vehicles = vehicles;
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", birthYear=" + birthYear + ", films=" + films + ", gender=" + gender
				+ ", hairColor=" + hairColor + ", height=" + height + ", homeworld=" + homeworld + ", mass=" + mass
				+ ", skinColor=" + skinColor + ", created=" + created + ", edited=" + edited + ", url=" + url
				+ ", species=" + species + ", starships=" + starships + ", vehicles=" + vehicles + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthYear == null) ? 0 : birthYear.hashCode());
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + ((edited == null) ? 0 : edited.hashCode());
		result = prime * result + ((films == null) ? 0 : films.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((hairColor == null) ? 0 : hairColor.hashCode());
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result + ((homeworld == null) ? 0 : homeworld.hashCode());
		result = prime * result + ((mass == null) ? 0 : mass.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((skinColor == null) ? 0 : skinColor.hashCode());
		result = prime * result + ((species == null) ? 0 : species.hashCode());
		result = prime * result + ((starships == null) ? 0 : starships.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		result = prime * result + ((vehicles == null) ? 0 : vehicles.hashCode());
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
		People other = (People) obj;
		if (birthYear == null) {
			if (other.birthYear != null)
				return false;
		} else if (!birthYear.equals(other.birthYear))
			return false;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
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
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (hairColor == null) {
			if (other.hairColor != null)
				return false;
		} else if (!hairColor.equals(other.hairColor))
			return false;
		if (height == null) {
			if (other.height != null)
				return false;
		} else if (!height.equals(other.height))
			return false;
		if (homeworld == null) {
			if (other.homeworld != null)
				return false;
		} else if (!homeworld.equals(other.homeworld))
			return false;
		if (mass == null) {
			if (other.mass != null)
				return false;
		} else if (!mass.equals(other.mass))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (skinColor == null) {
			if (other.skinColor != null)
				return false;
		} else if (!skinColor.equals(other.skinColor))
			return false;
		if (species == null) {
			if (other.species != null)
				return false;
		} else if (!species.equals(other.species))
			return false;
		if (starships == null) {
			if (other.starships != null)
				return false;
		} else if (!starships.equals(other.starships))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		if (vehicles == null) {
			if (other.vehicles != null)
				return false;
		} else if (!vehicles.equals(other.vehicles))
			return false;
		return true;
	}
	
	
}
