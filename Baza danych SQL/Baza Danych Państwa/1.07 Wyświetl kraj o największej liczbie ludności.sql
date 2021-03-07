/* Napisz zapytanie SQL odpowiedzialne za znalezienie kraju o największej populacji w tabeli
country .
 */
 
 select name, population from country where population in (select max(population) from country);