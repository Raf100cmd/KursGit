public class Zadanie24 {

    private int dzien;
    private int miesiac;
    private int rok;


    public int getDzien() {
        return dzien;
    }

    public void setDzien(int dzien) {
        this.dzien = dzien;
    }

    public int getMiesiac() {
        return miesiac;
    }

    public void setMiesiac(int miesiac) {
        this.miesiac = miesiac;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    //de/mm/rr
        public void sformatujIWyswietlDate(){

        System.out.println(dzien + "/" + miesiac + "/" + rok );


            }
    public void sformatujIWyswietlDatePrintf(){

        System.out.printf("%d/%3d/%3d", dzien, miesiac, rok );
    }
}
