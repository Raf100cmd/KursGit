-- 1.07 Zadanie
/* Napisz w SQL-u instrukcję, która pobiera identyfikator klienta (kl_id)
i numer zamówienia (zam_numer) z tabeli Zamówienia oraz sortuje wyniki 
najpierw wg identyfikatorów klientów, a następnie wg daty zamówienia 
w odwrotnej kolejności chronologicznej (od najnowszej).  */

SELECT kl_id, zam_numer FROM Zamowienia ORDER BY kl_id, zam_data DESC;