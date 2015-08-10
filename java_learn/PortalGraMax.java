import java.lang.String;
import java.lang.System;
import java.util.ArrayList;

public class PortalGraMax {

    private PomocnikGry pomocnik = new PomocnikGry();
    private ArrayList<Portal> listaPortali = new ArrayList<Portal>();
    private int iloscRuchow = 0;

    private void przygotujGre() {
        Portal pierwszy = new Portal();
        pierwszy.setNazwa("onet.pl");
        Portal drugi = new Portal();
        drugi.setNazwa("wp.pl");
        Portal trzeci = new Portal();
        trzeci.setNazwa("Go2.pl");
        listaPortali.add(pierwszy);
        listaPortali.add(drugi);
        listaPortali.add(trzeci);

        System.out.println("Twoim celem jest zatopienie trzech portali.");
        System.out.println("onet.pl, wp.pl, Go2.pl");
        System.out.println("Postaraj się zatopić je w jak najmniejszej ilości ruchów.");

        for (Portal rozmieszczanyPortal : listaPortali) {
            ArrayList<String> nowePolozenie = pomocnik.rozmiescPortal(3);
            rozmieszczanyPortal.setPolaPolozenia(nowePolozenie);
        }
    }

    private void rozpocznijGre() {
        while (!listaPortali.isEmpty()) {
            String ruchGracza = pomocnik.pobierzDaneWejsciowe("Podaj pole:");
            sprawdzRuchGracza(ruchGracza);
        }
        zakonczGre();
    }

    private void sprawdzRuchGracza(String ruch) {
        iloscRuchow++;
        String wynik = "pudło";

        for (Portal portalDoSprawdzenia : listaPortali) {
            wynik = portalDoSprawdzenia.sprawdz(ruch);
            if (wynik.equals("trafiony")) {
                break;
            }
            if (wynik.equals("zatopiony")) {
                listaPortali.remove(portalDoSprawdzenia);
                break;
            }
        }
        System.out.println(wynik);
    }

    private void zakonczGre() {
        System.out.println("Wszystkie Portale zostaly zatopione.");
        if (iloscRuchow <= 18 ) {
            System.out.println("Niezle, mniej niz 19 ruchow");
        } else {
            System.out.println("Slabo, wiecej niz 18 ruchow");
        }
    }


    public static void main (String[] args) {
        PortalGraMax gra = new PortalGraMax();
        gra.przygotujGre();
        gra.rozpocznijGre();
    }
}