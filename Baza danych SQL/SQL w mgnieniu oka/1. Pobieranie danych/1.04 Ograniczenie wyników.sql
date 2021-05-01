-- Zadanie 1.04 Ograniczenie liczby zwracanych wyników
/* Z tabeli produkty zwróć pięć wyników z kolumny prod_nazwa, począwszy od wiersza numer trzy */

 select prod_nazwa  from produkty limit 5 offset 3; 
-- to samo zapytanie można zapisać w inny sposób
 select prod_nazwa  from produkty limit 3,5; 