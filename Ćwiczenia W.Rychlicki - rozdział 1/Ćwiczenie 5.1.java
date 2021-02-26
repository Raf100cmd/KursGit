package RychlickiWZadania.PrawdaFalsz_LogicznyTypDanych;
/* Napisz program, który w formie tabeli przedstawi dowód następujących praw logicznych:
a) prawo wyłączonego środka p v ~p ,
b) prawo niesprzecznoci ~(p ^ ~p) ,
c) prawo podwójnego przeczenia ~(~ p) == p . */

public class PrawaLogiczne {

    public static void main(String[] args) {

        int podkreslenie;
        boolean [] logicznyTypDanych = {false, true};
        String prawoWylaczonegoSrodka = "prawo wyłączonego środka p || !p";
        String prawoNiesprzecznosci = "prawo niesprzecznoci !(p && !p)";
        String prawoPodwojnegoPrzeczenia = "prawo podwójnego przeczenia !(! p) == p";
        String [] prawaLogiczne = {prawoWylaczonegoSrodka, prawoNiesprzecznosci, prawoPodwojnegoPrzeczenia};

        // PRAWO WYŁĄCZONEGO ŚRODKA
        System.out.println(prawaLogiczne[0]);
        for(podkreslenie = 0; podkreslenie <= prawoWylaczonegoSrodka.length(); podkreslenie ++){System.out.print("*");}
        System.out.println();
        System.out.println("p \t\t(NOT) !p\t(p || !p)");
        for(podkreslenie = 0; podkreslenie <= prawoWylaczonegoSrodka.length(); podkreslenie ++){System.out.print("-");}
        System.out.println();
        for(boolean p: logicznyTypDanych ){ System.out.println(p+"\t"+!p+"\t"+"\t"+(p || !p));}
        for(podkreslenie = 0; podkreslenie <= prawoWylaczonegoSrodka.length(); podkreslenie ++){System.out.print("-");}
        System.out.println();

        //  PRAWO NIESPRZECZNOŚCI
        System.out.println();
        System.out.println(prawaLogiczne[1]);
        for(podkreslenie = 0; podkreslenie <= prawoNiesprzecznosci.length(); podkreslenie ++){System.out.print("*");}
        System.out.println();
        System.out.println("p \t\t(NOT) !p\t!(p && !p)");
        for(podkreslenie = 0; podkreslenie <= prawoNiesprzecznosci.length(); podkreslenie ++){System.out.print("-");}
        System.out.println();
        for(boolean p: logicznyTypDanych ){System.out.println(p+"\t"+!p+"\t"+"\t"+!(p && !p));}
        for(podkreslenie = 0; podkreslenie <= prawoNiesprzecznosci.length(); podkreslenie ++){System.out.print("-");}
        System.out.println();

        //PRAWO PODWÓJNEGO PRZECZENIA
        System.out.println();
        System.out.println(prawaLogiczne[2]);
        for(podkreslenie = 0; podkreslenie <= prawoPodwojnegoPrzeczenia.length(); podkreslenie ++){System.out.print("*");}
        System.out.println();
        System.out.println("p \t\t(NOT) !p\t!(! p) == p");
        for(podkreslenie = 0; podkreslenie <= prawoPodwojnegoPrzeczenia.length(); podkreslenie ++){System.out.print("-");}
        System.out.println();
        for(boolean p: logicznyTypDanych ){System.out.println(p+"\t"+!p+"\t"+"\t"+(!(!p) == !p));}
        for(podkreslenie = 0; podkreslenie <= prawoPodwojnegoPrzeczenia.length(); podkreslenie ++){System.out.print("-");}
        System.out.println();
    }
}
