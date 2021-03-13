/* Napisz zapytanie SQL odpowiedzialne za znalezienie państwa z najwyższą i najniższą
 oczekiwaną długością życia.
*/

select name as Country, lifeExpectancy from country where lifeExpectancy in (select max(lifeExpectancy) from country) union
select name as Country, lifeExpectancy from country where lifeExpectancy in (select min(lifeExpectancy) from country);
