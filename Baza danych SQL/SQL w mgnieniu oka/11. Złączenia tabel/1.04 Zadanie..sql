-- Zadanie 1.04
/* Napisz w SQL-u instrukcję, która zwraca nazwę klienta (kl_nazwa) z tabeli Klienci
i numery powiązanych zamówień (zam_numer) z tabeli Zamowienia. Wyniki posortuj najpierw wg nazw klientów,
a następnie wg numerów zamówień */

SELECT kl_nazwa, zam_numer FROM Klienci INNER JOIN Zamowienia ON 
Klienci.kl_id = Zamowienia.kl_id ORDER BY kl_nazwa, zam_numer;