/* Wyświetl wszystkie miasta z Polski */

select city.name as Towns, city.population from city left join country on city.countryCode = country.code where country.name = 'Poland';