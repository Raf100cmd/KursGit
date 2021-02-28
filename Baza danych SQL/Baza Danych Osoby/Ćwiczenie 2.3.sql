select * from osoba where ( (saldo_ma - saldo_wn) in (select max(saldo_ma - saldo_wn) from osoba where dodano between '2011-12-31' and '2013-01-01' ));

select max(saldo_ma - saldo_wn) from osoba where dodano between '2011-12-31' and '2013-01-01';