<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app='app'>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<head>
<script src="<c:url value='/static/js/angular.js' />"></script>
<script src="<c:url value='/static/js/app.js' />"></script>
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
  <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body ng-controller="WeatherController">
    <div class="fulldiv">
    
	<h2 class="tlt-txt">Weather Generator!</h2>
	Please select a city from the list: <select data-ng-options="o.city for o in cities" data-ng-model="city"
		ng-change="checkWeather()" ng-init="city = cities[0]"></select>
        
       
	<h2 ng-bind="data.query.results.channel.title" class="tlt-txt"></h2>
		<table>

		<tr>
			<td ng-bind="data.query.results.channel.lastBuildDate" class="date-txt txt-top"></td>
		</tr><tr>
			
			<td ng-bind="data.query.results.channel.item.condition.text" class="date-txt"></td>
		</tr>
		<tr>
            
        <td ng-show="data" rowspan="2"></td>
        <td rowspan="2"><span ng-bind="(data.query.results.channel.item.forecast[0].high)" class="bigdigi"></span ><span ng-bind="(data.query.results.channel.units.temperature)" class="smalldigi"></span></td>   
            
              
        
         <td ><span>Wind: </span> <span ng-bind="data.query.results.channel.wind.speed"></span>  <span ng-bind="data.query.results.channel.units.speed"></span></td>
                    <td ></td> 

        <tr>
             <td class="last-td"> <span>Humidity: </span><span ng-show="data.query.results.channel.atmosphere.humidity" ng-bind="(data.query.results.channel.atmosphere.humidity) + ('%')"></span></td>
        
        </tr>

		</tr> 
     
	</table>
         </div>
</body>
</html>
