?* Znajdź średnią wartość wpłaty w rozbiciu na miejscowość,
z uwględnieniem tych, które mają saldo dodatnie */

select  ((saldo_ma)/ilosc_wplat), miejscowosc from osoba where (saldo_ma - saldo_wn) > 0 order by miejscowosc asc;