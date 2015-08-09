import java.lang.String;
import java.lang.System;
import java.util.ArrayList;

class ArrListTester {
    public static void main (String[] args) {
//        Jajko j1 = new Jajko();
//        Jajko j2 = new Jajko();
        //j1.stluczSie("plask");
        //j2.stluczSie("pac");

        ArrayList<String> mojaTbl = new ArrayList<String>();

        System.out.println(mojaTbl);

        mojaTbl.add("1");
        mojaTbl.add("2");
        int ilosc = mojaTbl.size();
        System.out.println(mojaTbl);
        System.out.println(ilosc);

        int indeks = mojaTbl.indexOf("2");
        System.out.println("Indeks strzału = " + indeks);

//        mojaTbl = [10, 11, 12, 13];
//        System.out.println(mojaTbl);
//        System.out.println(ilosc);


    }
}