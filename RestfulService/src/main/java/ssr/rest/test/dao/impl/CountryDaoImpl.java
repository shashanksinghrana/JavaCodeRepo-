package ssr.rest.test.dao.impl;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ssr.rest.test.model.Country;

@Repository
public class CountryDaoImpl implements ssr.rest.test.dao.CountryDao {
	
	@Autowired
	SessionFactory sFactory;

	@Override
	public Country addCountry(Country country) {
		 Session session =  sFactory.getCurrentSession();
		 session.save(country);
		 return country;
	}

	@Override
	public Country updateCountry(Country country) {
		Session session =  sFactory.getCurrentSession();
		 session.update(country);
		 return country;
	}

	@Override
	public void deleteCountry(int id) {
		Session session =  sFactory.getCurrentSession();
		 session.delete(getCountryByID(id));
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Country> getListOfCountries() {
		Session session = sFactory.getCurrentSession();
		return session.createQuery("from Country").list();
		/*List<String> countries = new ArrayList<String>();
		countries.add("Japan");
		countries.add("India");
		
		return countries;*/
		
	}

	@Override
	public Country getCountryByID(int id) {
		Session session = sFactory.getCurrentSession();
		return (Country) session.get(Country.class, id);
	}	
}
