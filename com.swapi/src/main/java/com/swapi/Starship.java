package com.swapi;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Starship implements Serializable{

    private String name;
    private String model;
    private String manufacturer;
    @SerializedName("cost_in_credits")
    private String costInCredits;
    private String length;
    @SerializedName("max_atmosphering_speed")
    private String maxAtmospheringSpeed;
    private String crew;
    private String passengers;
    private String cargo_capacity;
    private String consumables;
    @SerializedName("hyperdrive_rating")
    private String hyperdriveRating;
    @SerializedName("MGLT")
    private String mglt;
    @SerializedName("starship_class")
    private String starshipClass;
    private List<Object> pilots;
    private List<String> films;
    private String created;
    private String edited;
    private String url;
    
	public Starship() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Starship(String name, String model, String manufacturer, String costInCredits, String length,
			String maxAtmospheringSpeed, String crew, String passengers, String cargo_capacity, String consumables,
			String hyperdriveRating, String mglt, String starshipClass, List<Object> pilots, List<String> films,
			String created, String edited, String url) {
		super();
		this.name = name;
		this.model = model;
		this.manufacturer = manufacturer;
		this.costInCredits = costInCredits;
		this.length = length;
		this.maxAtmospheringSpeed = maxAtmospheringSpeed;
		this.crew = crew;
		this.passengers = passengers;
		this.cargo_capacity = cargo_capacity;
		this.consumables = consumables;
		this.hyperdriveRating = hyperdriveRating;
		this.mglt = mglt;
		this.starshipClass = starshipClass;
		this.pilots = pilots;
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
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getCostInCredits() {
		return costInCredits;
	}
	public void setCostInCredits(String costInCredits) {
		this.costInCredits = costInCredits;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getMaxAtmospheringSpeed() {
		return maxAtmospheringSpeed;
	}
	public void setMaxAtmospheringSpeed(String maxAtmospheringSpeed) {
		this.maxAtmospheringSpeed = maxAtmospheringSpeed;
	}
	public String getCrew() {
		return crew;
	}
	public void setCrew(String crew) {
		this.crew = crew;
	}
	public String getPassengers() {
		return passengers;
	}
	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}
	public String getCargo_capacity() {
		return cargo_capacity;
	}
	public void setCargo_capacity(String cargo_capacity) {
		this.cargo_capacity = cargo_capacity;
	}
	public String getConsumables() {
		return consumables;
	}
	public void setConsumables(String consumables) {
		this.consumables = consumables;
	}
	public String getHyperdriveRating() {
		return hyperdriveRating;
	}
	public void setHyperdriveRating(String hyperdriveRating) {
		this.hyperdriveRating = hyperdriveRating;
	}
	public String getMglt() {
		return mglt;
	}
	public void setMglt(String mglt) {
		this.mglt = mglt;
	}
	public String getStarshipClass() {
		return starshipClass;
	}
	public void setStarshipClass(String starshipClass) {
		this.starshipClass = starshipClass;
	}
	public List<Object> getPilots() {
		return pilots;
	}
	public void setPilots(List<Object> pilots) {
		this.pilots = pilots;
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
		return "Starship [name=" + name + ", model=" + model + ", manufacturer=" + manufacturer + ", costInCredits="
				+ costInCredits + ", length=" + length + ", maxAtmospheringSpeed=" + maxAtmospheringSpeed + ", crew="
				+ crew + ", passengers=" + passengers + ", cargo_capacity=" + cargo_capacity + ", consumables="
				+ consumables + ", hyperdriveRating=" + hyperdriveRating + ", mglt=" + mglt + ", starshipClass="
				+ starshipClass + ", pilots=" + pilots + ", films=" + films + ", created=" + created + ", edited="
				+ edited + ", url=" + url + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cargo_capacity == null) ? 0 : cargo_capacity.hashCode());
		result = prime * result + ((consumables == null) ? 0 : consumables.hashCode());
		result = prime * result + ((costInCredits == null) ? 0 : costInCredits.hashCode());
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + ((crew == null) ? 0 : crew.hashCode());
		result = prime * result + ((edited == null) ? 0 : edited.hashCode());
		result = prime * result + ((films == null) ? 0 : films.hashCode());
		result = prime * result + ((hyperdriveRating == null) ? 0 : hyperdriveRating.hashCode());
		result = prime * result + ((length == null) ? 0 : length.hashCode());
		result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result + ((maxAtmospheringSpeed == null) ? 0 : maxAtmospheringSpeed.hashCode());
		result = prime * result + ((mglt == null) ? 0 : mglt.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((passengers == null) ? 0 : passengers.hashCode());
		result = prime * result + ((pilots == null) ? 0 : pilots.hashCode());
		result = prime * result + ((starshipClass == null) ? 0 : starshipClass.hashCode());
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
		Starship other = (Starship) obj;
		if (cargo_capacity == null) {
			if (other.cargo_capacity != null)
				return false;
		} else if (!cargo_capacity.equals(other.cargo_capacity))
			return false;
		if (consumables == null) {
			if (other.consumables != null)
				return false;
		} else if (!consumables.equals(other.consumables))
			return false;
		if (costInCredits == null) {
			if (other.costInCredits != null)
				return false;
		} else if (!costInCredits.equals(other.costInCredits))
			return false;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (crew == null) {
			if (other.crew != null)
				return false;
		} else if (!crew.equals(other.crew))
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
		if (hyperdriveRating == null) {
			if (other.hyperdriveRating != null)
				return false;
		} else if (!hyperdriveRating.equals(other.hyperdriveRating))
			return false;
		if (length == null) {
			if (other.length != null)
				return false;
		} else if (!length.equals(other.length))
			return false;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (maxAtmospheringSpeed == null) {
			if (other.maxAtmospheringSpeed != null)
				return false;
		} else if (!maxAtmospheringSpeed.equals(other.maxAtmospheringSpeed))
			return false;
		if (mglt == null) {
			if (other.mglt != null)
				return false;
		} else if (!mglt.equals(other.mglt))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (passengers == null) {
			if (other.passengers != null)
				return false;
		} else if (!passengers.equals(other.passengers))
			return false;
		if (pilots == null) {
			if (other.pilots != null)
				return false;
		} else if (!pilots.equals(other.pilots))
			return false;
		if (starshipClass == null) {
			if (other.starshipClass != null)
				return false;
		} else if (!starshipClass.equals(other.starshipClass))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}
    
	
}
