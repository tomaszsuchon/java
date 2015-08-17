public class MojaListaZwierzatTester {
    public static void main(String[] args) {
        MojaListaZwierzat lista1 = new MojaListaZwierzat();
        Pies p = new Pies();
        Kot k = new Kot();

        lista1.dodaj(p);
        lista1.dodaj(k);
    }
}