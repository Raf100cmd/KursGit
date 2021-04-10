/* Wyswietl miasto o największej liczbie mieszkańców */

select name as Town, population from  city where population in (select max(population) from city);