/* Sporządź raport ze średniego salda oraz ilość wpłat dla
każdej miejscowości, która ma całkowite saldo dodatnie */



select miejscowosc, ilosc_wplat, ((saldo_ma - saldo_wn)/ ilosc_wplat) from osoba where (saldo_ma - saldo_wn) > 0;