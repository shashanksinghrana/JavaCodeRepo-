package ssr.rest.test.service.impl;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import ssr.rest.test.model.City;

@XmlRootElement(name = "country-list")
public class CityList {

	List<City> listOfCountries;

	public CityList() {
		super();
	}

	public CityList(List<City> listOfCountries) {
		this.listOfCountries = listOfCountries;
	}

	public List<City> getListOfCountries() {
		return listOfCountries;
	}

	@XmlElement(name = "city")
	public void setListOfCountries(List<City> listOfCountries) {
		this.listOfCountries = listOfCountries;
	}

}
