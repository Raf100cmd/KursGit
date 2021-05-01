-- 1.08 Zadanie
/* Właściciele sklepu wola sprzedawać droższe produkty w jak największych ilościach.
Napisz w SQL-u instrukcję, która wyświetla liczbę sztuk i cenę jednostkową (cena_elem)
z tabeli ElementyZamowienia. Wyniki maja być posortowane od największej liczby sztuk i najwyższych cen */

SELECT ilosc, cena_elem FROM ElementyZamowienia ORDER BY ilosc DESC, cena_elem DESC;