/* druga część zadania

importujemy plik osoby 5000  
(przycisk - open a script file in this editor)
po zaimportowaniu dodajemy dane skrót klawiszowy ctr + A (zaznaczamy wszystkie dane) i klikamy przycisk
(przycisk - Execute the selected portion of the script or everything if there is no selection) */

create database osoba;

use osoba;

create table osoba (
id int primary key not null auto_increment,
nazwa varchar (100),
dodano varchar (100),
ulica varchar(100),
nr_domu varchar(20),
nr_lokalu varchar(20),
poczta varchar (100),
kod_pocztowy varchar (70),
miejscowosc varchar(100),
data_urodzenia varchar(70),
saldo_wn varchar(20),
saldo_ma varchar(20),
ilosc_wplat varchar (10)); 


delete from osoba; 
select * from osoba; 