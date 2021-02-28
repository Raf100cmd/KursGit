/* Sprawdź jaka jest ilosc wplat 
rozbicu na rok dodania osoby do bazy */

select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='1990' ) union
select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='1991' ) union
select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='1992' ) union
select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='1993' ) union
select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='1994' ) union
select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='1995' ) union
select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='1996' ) union
select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='1997' ) union
select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='1998' ) union
select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='1999' ) union
select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='2000' ) union
select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='2001' ) union
select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='2002' ) union
select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='2003' ) union
select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='2004' ) union
select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='2005' ) union
select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='2006' ) union
select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='2007' ) union
select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='2008' ) union
select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='2009' ) union
select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='2010' ) union
select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='2011' ) union
select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='2012' ) union
select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='2013' ) union
select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='2014' ) union
select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='2015' ) union
select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='2016' ) union
select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='2017' ) union
select substring(dodano,1,4), sum(ilosc_wplat) from osoba where (substring(dodano,1,4)='2018' );