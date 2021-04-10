/* Wyświetl liczbe miast chińskich ujętych w bazie danych */

select count(ID) as 'numbers of China Town`s' from city where countrycode = "CHN";