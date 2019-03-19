package ssr.rest.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ssr.rest.test.model.City;
import ssr.rest.test.service.impl.CityList;

@RestController
public class SpringXMLRestController {

	@RequestMapping(value = "/cities", method = RequestMethod.GET, headers = "Accept=application/xml")
	public CityList getCountries() {
		CityList CityList = createCityList();
		return CityList;
	}

	@RequestMapping(value = "/city/{id}", method = RequestMethod.GET, headers = "Accept=application/xml")
	public City getCityById(@PathVariable int id) {
		List<City> listOfCountries = new ArrayList<City>();
		CityList CityList = createCityList();
		listOfCountries = CityList.getListOfCountries();
		for (City City : listOfCountries) {
			if (City.getId() == id)
				return City;
		}

		return null;
	}

	/// Utiliy method to create City list.
	public CityList createCityList() {
		City indiaCity = new City(1, "Pune");
		City chinaCity = new City(4, "Kolkatta");
		City nepalCity = new City(3, "Mumbai");
		City bhutanCity = new City(2, "Delhi");

		List<City> listOfCountries = new ArrayList<City>();
		listOfCountries.add(indiaCity);
		listOfCountries.add(chinaCity);
		listOfCountries.add(nepalCity);
		listOfCountries.add(bhutanCity);
		return new CityList(listOfCountries);
	}
	
}
