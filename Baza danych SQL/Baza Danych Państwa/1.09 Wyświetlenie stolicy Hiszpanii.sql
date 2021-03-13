/*  Napisz zapytanie SQL odpowiedzialne za wyszuknie stolicy Spain (ESP) . */

select city.name as Capital, country.code, country.name as Country from city left join country on city.ID = country.capital where country.name = 'Spain'; 