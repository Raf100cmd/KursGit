/* Zmodykuj kod z zadania nr 9,
w taki sposób aby użytkownik samodzielnie podawał
ilość wyświetlonych komunikatów.*/

import java.util.Scanner;

public class ExerciseTen {

    public static void main(String[] args) {

        Scanner MessageUser = new Scanner(System.in);
        System.out.println("Ile komunikatów wyświetlić");
        int last = MessageUser.nextInt();

        for (int a = 0; a <= last -1 ; a++) {

            System.out.println("To jest " + a + " " + "komunikat w pętli");
        }
    }
}