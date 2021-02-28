/* Znajdź osoby których saldo jest większe od średniego salda i 
ilośc wpłat jest pomiedzy 50 a 80 */


select nazwa, ilosc_wplat from osoba where (ilosc_wplat between 50 and 80) and (saldo_ma - saldo_wn) > (select avg(saldo_ma - saldo_wn) from osoba) ;