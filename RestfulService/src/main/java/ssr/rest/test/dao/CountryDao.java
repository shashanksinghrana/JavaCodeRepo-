package ssr.rest.test.dao;

import java.util.List;

import ssr.rest.test.model.Country;

public interface CountryDao {
	
	public Country addCountry(Country country);

	public Country updateCountry(Country country);

	public void deleteCountry(int id);

	public List<Country>getListOfCountries();

	public Country getCountryByID(int id);
}
