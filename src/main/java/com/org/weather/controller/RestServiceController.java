package com.org.weather.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.org.weather.model.City;
import com.org.weather.model.Result;

@RestController
@PropertySource(value = { "classpath:application.properties" })
public class RestServiceController {

	@Autowired
	private Environment environment;

	/*
	 * Author: Nadeem Shaikh
	 * Description: This Method is generate the list of Cities for the Dropdown
	 * Param : none
	 * Response : List of Cities in Json Format
	 *  
	 */
	@RequestMapping(value = { "/cities" }, method = RequestMethod.GET)
	public String getCities() {
		String returnVal = "";
		List<City> m = new ArrayList<City>();
		try
		{
			//Fetch value of cities from the application.properties file
			String inputCities = environment.getRequiredProperty("cities");
			
			//Split the comma separated cities and collect in String Array
			String[] cities = inputCities.split(",");
	
			for (String key : cities)
				m.add(new City(key));
	
			Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation()
					.create();
			returnVal = gson.toJson(m);
			return returnVal;
		}
		catch (Exception ex)
		{
			return returnVal ;
			
		}

	}

	/*
	 * Author: Nadeem Shaikh
	 * Description: This Method is used to call the Yahoo Weather API
	 * Param : City
	 * Response : Weather Data in Json
	 *  
	 */
	@RequestMapping(value = { "/findWeather" }, method = RequestMethod.GET)
	public String findWeather(@QueryParam("city") String city) {
	
		String returnVal = "";
		Gson gson = new GsonBuilder().create();
		RestTemplate restTemplate = new RestTemplate();
		try
		{
	
			String url = "http://query.yahooapis.com/v1/public/yql?q=select *  from weather.forecast where woeid in (select woeid from geo.places(1) where text='"
					+ city + "' )and u='c'&format=json";
			Result result = restTemplate.getForObject(url, Result.class);

			returnVal = gson.toJson(result);
			return returnVal;
		}
		catch (Exception ex)
		{
			//returnVal = "Weather is not Available";
			return returnVal ;
			
		}

	}
}
