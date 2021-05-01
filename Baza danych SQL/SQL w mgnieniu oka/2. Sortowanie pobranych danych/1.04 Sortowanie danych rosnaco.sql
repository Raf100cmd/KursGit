-- 1.04 Sortowanie danych rosnąco wzgledem ceny

select prod_id, prod_nazwa, prod_cena from produkty order by prod_cena asc;

/* domyślnie w programie jest ustawiona wartość rosnąca - więc postać zapytania może mieć następująca formę
 select prod_id, prod_nazwa, prod_cena from produkty order by prod_cena; */