import java.lang.String;
import java.lang.System;
import java.util.ArrayList;

class Portal {

    private ArrayList<String> polaPolozenia;
    //int iloscTrafien;

    public ArrayList<String> utworzStatek(){
        int liczbaLosowa = (int) (Math.random() * 5);
        int liczbaLosowa2 = liczbaLosowa + 1;
        int liczbaLosowa3 = liczbaLosowa + 2;

        String polozenieStatku1 = liczbaLosowa +"";
        String polozenieStatku2 = liczbaLosowa2 +"";
        String polozenieStatku3 = liczbaLosowa3 +"";

        ArrayList<String> polozenieStatku = new ArrayList<String>();
        polozenieStatku.add(polozenieStatku1);
        polozenieStatku.add(polozenieStatku2);
        polozenieStatku.add(polozenieStatku3);

        return polozenieStatku;
    }

    public void setPolaPolozenia(ArrayList<String> ppol) {
        polaPolozenia = ppol;
    }

    public String sprawdz(String ruch) {
        String wynik = "pudło";

        int indeks = polaPolozenia.indexOf(ruch);

        if (indeks >= 0) {
            polaPolozenia.remove(indeks);

            if (polaPolozenia.isEmpty()) {
                wynik = "zatopiony";
            } else {
                wynik = "trafiony";
            }
        }
        return wynik;
    } //koniec metody
} //koniec klasy