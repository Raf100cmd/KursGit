/* Napisz zapytanie SQL odpowiedzialne za odnalezienie tylko tych miast z tabeli city,
których populacja wynosi od 500000 do 1000000 .
 */
 
 select Name, Population from city where population between 500000 and 1000000;