package ssr.rest.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ssr.rest.test.model.Country;
import ssr.rest.test.service.CountryService;

@RestController
@RequestMapping("/countryopp")
public class SpringJSONRestController {

	@Autowired
	CountryService countryService;

	@RequestMapping(value = "/countries", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Country> getCountries() {
		
		return countryService.getListOfCountries();
//		List<Country> listOfCountries = new ArrayList<Country>();
//		listOfCountries = createCountryList();
//		return listOfCountries;
	}

	@RequestMapping(value = "/country/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Country getCountryById(@PathVariable int id) {
		return countryService.getCountryByID(id);
		
		/*List<Country> listOfCountries = new ArrayList<Country>();
		listOfCountries = createCountryList();

		for (Country country : listOfCountries) {
			if (country.getId() == id)
				return country;
		}

		return null;*/
	}

	@RequestMapping(value = "/countries", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Country addCountry(@RequestBody Country country) {
		return countryService.addCountry(country);
		
	}

	@RequestMapping(value = "/country/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Country updateCountry(@RequestBody Country country, @PathVariable int id) {
		country.setId(id);
		return countryService.updateCountry(country);

	}

	@RequestMapping(value = "/country/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteCountry(@PathVariable("id") int id) {
		countryService.deleteCountry(id);
	}
	
}
