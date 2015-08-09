import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;
import java.lang.System;

public class PomocnikGry {
    public String pobierzDaneWejsciowe(String komunikat) {
        String wierszWej = null;
        System.out.print(komunikat + " ");
        try {
            BufferedReader sw = new BufferedReader(
                    new InputStreamReader(System.in));
            wierszWej = sw.readLine();
            if (wierszWej.length() == 0) return null;


        } catch (IOException e) {
            System.out.print("IOException: " + e);
        }
        return wierszWej;
    }
}