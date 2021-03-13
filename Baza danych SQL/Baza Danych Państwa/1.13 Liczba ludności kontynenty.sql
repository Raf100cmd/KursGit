/* Wyświetl liczbę ludności i średnią długość życia na poszczególnych kontynentach */

select continent, sum(population), avg(lifeExpectancy) from country where continent = 'Asia'   union 
select continent, sum(population), avg(lifeExpectancy) from country where continent = 'Europe'  union
select continent, sum(population), avg(lifeExpectancy) from country where continent = 'North America'  union
select continent, sum(population), avg(lifeExpectancy) from country where continent = 'South America'  union
select continent, sum(population), avg(lifeExpectancy) from country where continent = 'Africa'  union
select continent, sum(population), avg(lifeExpectancy) from country where continent = 'Oceania'  union
select continent, sum(population), avg(lifeExpectancy) from country where continent = 'Antarctica'  order by continent asc ;
