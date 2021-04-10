/* wyświetl kraj o najmniejszej liczbie mieszkańców */

select name as country, population from country where population in (select min(population) from country);