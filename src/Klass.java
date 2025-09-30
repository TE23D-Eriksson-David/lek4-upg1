import java.util.ArrayList;
import java.util.Scanner;

public class Klass {
    ArrayList<Elever> Klassen = new ArrayList<Elever>();
    static int antalElever;

    public void läggTillElev(Elever elev) {
        Klassen.add(elev);
    }

    public void visaKlass() {
        antalElever = Klassen.size();
        System.out.println("\nDet finns:"+antalElever+" elever i klassen");
        for (int i = 0; i < Klassen.size(); i++) {
            Elever elev = Klassen.get(i);
            System.out.println();
            System.out.println("Namn: " + elev.namn + "\nPersonumer: " + elev.personNumer + "\nEmail: " + elev.email
                    + "\nMobilnumer: " + elev.mobilNumer + "\nKlass: " + elev.klass + "\nProgram: " + elev.program
                    + "");
        }

    }

    public void hittaElevInfo(Scanner TB) {
        System.out.println("\nAnge namnet för eleven: ");
        if (TB.hasNext())
            TB.nextLine();
        String namn = TB.nextLine();

        for (int i = 0; i < Klassen.size(); i++) {
            Elever elev = Klassen.get(i);
            if (namn.equals(elev.namn)) {
                System.out.println("\nNamn: " + elev.namn + "\nPersonumer: " + elev.personNumer + "\nEmail: " + elev.email
                        + "\nMobilnumer: " + elev.mobilNumer + "\nKlass: " + elev.klass + "\nProgram: " + elev.program
                        + "");
                break;
            }
            if (i == Klassen.size()) {
                System.out.println("Namnet som du har anget verkar inte tillhöra någon elev.\nFörsök igen,");
            }
        }
    }
}
