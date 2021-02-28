/* Znajdź najbardziej zadłużoną osobę */

select * from osoba where (saldo_ma - saldo_wn) in  (select min(saldo_ma - saldo_wn) from osoba);
select min(saldo_ma - saldo_wn) from osoba;