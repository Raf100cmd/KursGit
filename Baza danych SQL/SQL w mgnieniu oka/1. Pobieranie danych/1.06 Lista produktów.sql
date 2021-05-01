 -- Zadanie 1.06
 /* Tabela ElementyZamowienia zawiera wszystkie zamówione produkty (niektóre wielokrotnie).
 Napisz w SQL-u instrukcję, która pobiera listę zamówionych produktów (prod_id).
 Instrukcja ma zwracać tylko listę unikatowych produktów, a nie wszystkie wystąpienia
 produktów z każdego zamówienia.*/
 
 select distinct prod_id from ElementyZamowienia;