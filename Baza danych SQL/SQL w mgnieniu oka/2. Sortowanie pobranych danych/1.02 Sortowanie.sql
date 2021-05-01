-- 1.02 Sortowanie na podstawie położenia kolumny

select prod_id, prod_nazwa, prod_cena from produkty order by 3,2;

/* Trzeba znać umiejscowienie kolumn. 
Wada - inna kolejność sortowania gdy zmieni się szyk kolumn w tabeli.
Zaleta - uproszczenie składni  */