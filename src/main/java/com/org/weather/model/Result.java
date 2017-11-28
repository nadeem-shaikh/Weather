package com.org.weather.model;

import java.util.List;

public class Result {
	private Query query;

	public Query getQuery() {
		return query;
	}

	public void setQuery(Query query) {
		this.query = query;
	}

	public class Astronomy {

		private String sunrise;
		private String sunset;

		public String getSunrise() {
			return sunrise;
		}

		public void setSunrise(String sunrise) {
			this.sunrise = sunrise;
		}

		public String getSunset() {
			return sunset;
		}

		public void setSunset(String sunset) {
			this.sunset = sunset;
		}

	}

	public class Atmosphere {

		private String humidity;
		private String pressure;
		private String rising;
		private String visibility;

		public String getHumidity() {
			return humidity;
		}

		public void setHumidity(String humidity) {
			this.humidity = humidity;
		}

		public String getPressure() {
			return pressure;
		}

		public void setPressure(String pressure) {
			this.pressure = pressure;
		}

		public String getRising() {
			return rising;
		}

		public void setRising(String rising) {
			this.rising = rising;
		}

		public String getVisibility() {
			return visibility;
		}

		public void setVisibility(String visibility) {
			this.visibility = visibility;
		}

	}

	public class Channel {

		private Units units;
		private String title;
		private String link;
		private String description;
		private String language;
		private String lastBuildDate;
		private String ttl;
		private Location location;
		private Wind wind;
		private Atmosphere atmosphere;
		private Astronomy astronomy;
		private Image image;
		private Item item;

		public Units getUnits() {
			return units;
		}

		public void setUnits(Units units) {
			this.units = units;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getLink() {
			return link;
		}

		public void setLink(String link) {
			this.link = link;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getLanguage() {
			return language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public String getLastBuildDate() {
			return lastBuildDate;
		}

		public void setLastBuildDate(String lastBuildDate) {
			this.lastBuildDate = lastBuildDate;
		}

		public String getTtl() {
			return ttl;
		}

		public void setTtl(String ttl) {
			this.ttl = ttl;
		}

		public Location getLocation() {
			return location;
		}

		public void setLocation(Location location) {
			this.location = location;
		}

		public Wind getWind() {
			return wind;
		}

		public void setWind(Wind wind) {
			this.wind = wind;
		}

		public Atmosphere getAtmosphere() {
			return atmosphere;
		}

		public void setAtmosphere(Atmosphere atmosphere) {
			this.atmosphere = atmosphere;
		}

		public Astronomy getAstronomy() {
			return astronomy;
		}

		public void setAstronomy(Astronomy astronomy) {
			this.astronomy = astronomy;
		}

		public Image getImage() {
			return image;
		}

		public void setImage(Image image) {
			this.image = image;
		}

		public Item getItem() {
			return item;
		}

		public void setItem(Item item) {
			this.item = item;
		}

	}

	public class Condition {

		private String code;
		private String date;
		private String temp;
		private String text;

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getTemp() {
			return temp;
		}

		public void setTemp(String temp) {
			this.temp = temp;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

	}

	public class Forecast {

		private String code;
		private String date;
		private String day;
		private String high;
		private String low;
		private String text;

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getDay() {
			return day;
		}

		public void setDay(String day) {
			this.day = day;
		}

		public String getHigh() {
			return high;
		}

		public void setHigh(String high) {
			this.high = high;
		}

		public String getLow() {
			return low;
		}

		public void setLow(String low) {
			this.low = low;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

	}

	public class Guid {

		private String isPermaLink;

		public String getIsPermaLink() {
			return isPermaLink;
		}

		public void setIsPermaLink(String isPermaLink) {
			this.isPermaLink = isPermaLink;
		}

	}

	public class Image {

		private String title;
		private String width;
		private String height;
		private String link;
		private String url;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getWidth() {
			return width;
		}

		public void setWidth(String width) {
			this.width = width;
		}

		public String getHeight() {
			return height;
		}

		public void setHeight(String height) {
			this.height = height;
		}

		public String getLink() {
			return link;
		}

		public void setLink(String link) {
			this.link = link;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

	}

	public class Item {

		private String title;
		private String lat;
		private String _long;
		private String link;
		private String pubDate;
		private Condition condition;
		private List<Forecast> forecast = null;
		private String description;
		private Guid guid;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getLat() {
			return lat;
		}

		public void setLat(String lat) {
			this.lat = lat;
		}

		public String getLong() {
			return _long;
		}

		public void setLong(String _long) {
			this._long = _long;
		}

		public String getLink() {
			return link;
		}

		public void setLink(String link) {
			this.link = link;
		}

		public String getPubDate() {
			return pubDate;
		}

		public void setPubDate(String pubDate) {
			this.pubDate = pubDate;
		}

		public Condition getCondition() {
			return condition;
		}

		public void setCondition(Condition condition) {
			this.condition = condition;
		}

		public List<Forecast> getForecast() {
			return forecast;
		}

		public void setForecast(List<Forecast> forecast) {
			this.forecast = forecast;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Guid getGuid() {
			return guid;
		}

		public void setGuid(Guid guid) {
			this.guid = guid;
		}

	}

	public class Location {

		private String city;
		private String country;
		private String region;

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getRegion() {
			return region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

	}

	public class Query {

		private Integer count;
		private String created;
		private String lang;
		private Results results;

		public Integer getCount() {
			return count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public String getCreated() {
			return created;
		}

		public void setCreated(String created) {
			this.created = created;
		}

		public String getLang() {
			return lang;
		}

		public void setLang(String lang) {
			this.lang = lang;
		}

		public Results getResults() {
			return results;
		}

		public void setResults(Results results) {
			this.results = results;
		}

	}

	public class Results {

		private Channel channel;

		public Channel getChannel() {
			return channel;
		}

		public void setChannel(Channel channel) {
			this.channel = channel;
		}

	}

	public class Units {

		private String distance;
		private String pressure;
		private String speed;
		private String temperature;

		public String getDistance() {
			return distance;
		}

		public void setDistance(String distance) {
			this.distance = distance;
		}

		public String getPressure() {
			return pressure;
		}

		public void setPressure(String pressure) {
			this.pressure = pressure;
		}

		public String getSpeed() {
			return speed;
		}

		public void setSpeed(String speed) {
			this.speed = speed;
		}

		public String getTemperature() {
			return temperature;
		}

		public void setTemperature(String temperature) {
			this.temperature = temperature;
		}

	}

	public class Wind {

		private String chill;
		private String direction;
		private String speed;

		public String getChill() {
			return chill;
		}

		public void setChill(String chill) {
			this.chill = chill;
		}

		public String getDirection() {
			return direction;
		}

		public void setDirection(String direction) {
			this.direction = direction;
		}

		public String getSpeed() {
			return speed;
		}

		public void setSpeed(String speed) {
			this.speed = speed;
		}

	}
}
