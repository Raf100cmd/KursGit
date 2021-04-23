-- Zadanie 1.07
/* Napisz instrukcję, która pobiera z tabeli Produkty wszystkie nazwy produktów (prod_nazwa), 
a także obliczoną kolumnę o nazwie (sprzedano_sztuk) zawierającą łączną liczbę sprzedanych sztuk
każdego produktu. */

SELECT prod_nazwa, (SELECT SUM(ilosc) FROM ElementyZamowienia WHERE
 Produkty.prod_id = ElementyZamowienia.prod_id) AS sprzedano_sztuk FROM Produkty;