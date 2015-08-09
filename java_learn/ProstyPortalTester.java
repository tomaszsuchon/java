public class ProstyPortalTester {
    public static void main (String[] args) {
        ProstyPortal wit = new ProstyPortal();
        int[] polozenia = {2,3,4};
        wit.setPolaPolozenia(polozenia);
        String wybranePole = "3";
        String wynik = wit.sprawdz(wybranePole);
    }
}