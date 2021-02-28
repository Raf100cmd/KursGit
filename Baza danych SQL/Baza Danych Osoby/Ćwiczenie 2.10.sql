/* ilość osób dodana w rozbicu na lata */

select count(nazwa), substring(dodano,1,4)  from osoba group by substring(dodano,1,4) ;