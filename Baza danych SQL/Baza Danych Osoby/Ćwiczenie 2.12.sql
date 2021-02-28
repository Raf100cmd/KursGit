/* Sporządź raport ze średniego salda
osób urodzonych pomiędzy 2000 a 2005 rokiem
w rozbiciu na miejscowści uszeregowane alfabetycznie */

select ((saldo_ma - saldo_wn)/ilosc_wplat)as srednie_saldo , nazwa as personalia, miejscowosc from osoba where data_urodzenia between '2000'and '2005' order by miejscowosc asc;