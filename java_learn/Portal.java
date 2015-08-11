import java.util.ArrayList;

class Portal {

    private String nazwa;
    private ArrayList<String> polaPolozenia;


    public void setPolaPolozenia(ArrayList<String> ppol)
    {
        polaPolozenia = ppol;
    }

    public void setNazwa (String nzwPortalu) {
        nazwa = nzwPortalu;
    }

    public String sprawdz(String ruch) {
        String wynik = "pudło";

        int indeks = polaPolozenia.indexOf(ruch);

        if (indeks >= 0) {
            polaPolozenia.remove(indeks);

            if (polaPolozenia.isEmpty()) {
                wynik = "zatopiony";
                System.out.println("Zatopiles Portal " + nazwa);
            } else {
                wynik = "trafiony";
            }
        }
        return wynik;
    } //koniec metody
} //koniec klasy