/*  Napisz zapytanie SQL odpowiedzialne za odnalezienie wszystkich nazw miast z tabeli city,
których nazwa zaczyna się od prefiksu Be .
 */
 
 select Name from city where Name like 'Be%' ;