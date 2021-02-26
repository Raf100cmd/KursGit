/* Napisz program, który uruchomiony z kilkoma argumentami wypisze każdy argument
 w odrębnym wierszu, odwracając przy tym kolejność znaków w argumencie. */
public class ArgumentyWspak2 {

    public static void main(String[] args) {

        String args1[] = {"jeden", "dwa", "trzy", "cztery", "piec", "szesc"};
        System.out.println("Wyświetlanie argumentów rosnąco");
        for (int i = 0; i < args1.length; i++) {
            System.out.println("Argument #" + (i + 1) + " = " + args1[i]);//
        }
        System.out.println("\b");
        System.out.println("Wyświetlanie argumentów malejąco");
        for(int a = args1.length -1 ; a >=  0; a -- ){
            System.out.println("Argument #" + (a + 1)+ " = " + args1[a] );
        }
        System.out.println("\b");
        System.out.println("Wyświetlanie argumentów wspak");
        // przegladanie argumentów tablicy - pętla zewnętrzna
        for (String argument: args1){
            // wyświetlanie argumentu wspak - pętla wewnętrzna
            for (int i = argument.length() - 1; i >= 0; i --){
                System.out.print(argument.charAt(i)+ " ");
            }
            System.out.println();
        }
    }
}
