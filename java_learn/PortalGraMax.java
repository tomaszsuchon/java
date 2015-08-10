import java.lang.String;
import java.lang.System;
import java.util.ArrayList;

public class PortalGra {
    public static void main (String[] args) {
        int iloscRuchow = 0;

        PomocnikGry pomocnik = new PomocnikGry();

        Portal portal = new Portal();

        ArrayList<String> polozenie = new ArrayList<String>();
        polozenie = portal.utworzStatek();


        portal.setPolaPolozenia(polozenie);
        System.out.println(polozenie);

        boolean czyIstnieje = true;

        while (czyIstnieje == true) {
            String pole = pomocnik.pobierzDaneWejsciowe("Podaj liczbę");
            String wynik = portal.sprawdz(pole);
            System.out.println(wynik);
            iloscRuchow++;

            if (wynik.equals("zatopiony")) {
                czyIstnieje = false;
                System.out.println(iloscRuchow + "ruchow");
            }
        }
    }
}