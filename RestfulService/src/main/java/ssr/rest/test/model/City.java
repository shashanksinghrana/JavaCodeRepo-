package ssr.rest.test.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="city")
public class City {
	 private int id;  
	 private String cityName;
	 
	public City() {
		super();
		
	}
	public City(int id, String cityName) {
		super();
		this.id = id;
		this.cityName = cityName;
	}
	@XmlElement
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@XmlElement
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	 
	 
}
