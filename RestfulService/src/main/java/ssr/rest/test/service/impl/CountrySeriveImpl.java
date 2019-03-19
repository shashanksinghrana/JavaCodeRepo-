package ssr.rest.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ssr.rest.test.dao.CountryDao;
import ssr.rest.test.model.Country;
import ssr.rest.test.service.CountryService;

@Service
public class CountrySeriveImpl implements CountryService {
	
	@Autowired
	CountryDao countryDao;

	@Override
	@Transactional
	public Country addCountry(Country country) {
		return countryDao.addCountry(country);
	}

	@Override
	@Transactional
	public Country updateCountry(Country country) {
		return countryDao.updateCountry(country);
	}

	@Override
	@Transactional
	public void deleteCountry(int id) {
		countryDao.deleteCountry(id);
	}

	@Override
	@Transactional
	public List<Country> getListOfCountries() {
		
		return countryDao.getListOfCountries();
		 
	}

	@Override
	@Transactional
	public Country getCountryByID(int id) {
		return countryDao.getCountryByID(id);
	}

}
