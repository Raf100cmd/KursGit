/* Napisz zapytanie SQL odpowiedzialne za wyświetlenie listy wszystkich języków używanych
w regionie Caribbean . */

elect countrylanguage.Language, country.Region, country.name from country left join countrylanguage on countrylanguage.CountryCode = country.code where country.Region = 'Caribbean';
