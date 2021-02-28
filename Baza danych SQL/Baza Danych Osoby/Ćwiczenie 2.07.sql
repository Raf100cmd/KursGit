/* Znajdź miejscowość z największym zadłużeniem oraz ilością wpłat mniejszą niż 50 */


select miejscowosc, min(saldo_ma - saldo_wn), ilosc_wplat from osoba where (ilosc_wplat) < 50;