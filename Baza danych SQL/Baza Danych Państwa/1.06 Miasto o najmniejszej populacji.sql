/* Wyświetl miasto o najmniejszej populacji */

select name, population from city where population in (select min(population) from city);