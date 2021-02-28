/*  Napisz zapytanie SQL odpowiedzialne za znalezienie tylko tych miast z tabeli city, 
których populacja jest większa niż 2000000 . */

select Name, population from city where Population > 2000000;