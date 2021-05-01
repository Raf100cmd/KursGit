-- 1.05 Sortowanie danych na podstawie kilku kolumn
/* Produkty są uporządkowane wg ceny malejąco, natomiast te, które mają taką samą cenę należy uporządkować alfabetycznie */

select prod_id, prod_nazwa, prod_cena from produkty order by prod_cena desc, prod_nazwa;