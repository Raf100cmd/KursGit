/*  Napisz zapytanie SQL odpowiedzialne za znalezienie wszystkich 
miast z kontynentu Europe . */

select city.name as Towns, city.countryCode as Code from city left join country on city.countryCode = country.code where country.continent = 'Europe';
