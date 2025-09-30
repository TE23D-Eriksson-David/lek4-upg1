import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner TB = new Scanner(System.in);
        Klass klass = new Klass();
        boolean klar = false;
        int val = 0;

        while (true) {
            System.out.println("\n1. Lägg Till Elev\n2. Hitta elevinformation\n3. Visa klass");
            System.out.print(":");
            val = VALMETOD(klar, val, TB, 1, 3);
            switch (val) {
                case 1:
                    klass.läggTillElev(registreraElev(TB));
                    break;

                case 2:
                    klass.hittaElevInfo(TB);
                    break;

                case 3:
                klass.visaKlass();
                    break;
            }

        }
    }

    static Elever registreraElev(Scanner TB) {

        System.out.println("Registrera en elev genom att fylla i följande information:");
        System.out.println("1. Namn\n2. Person Numer\n3. Email\n4. Mobilnumer\n5. Klass\n6. Program\n");

        System.out.println("Namn:");
                if (TB.hasNext())
            TB.nextLine();
        String namnElev = TB.nextLine();

        System.out.println("Personumer:");
        Long personNumer = TB.nextLong();

        System.out.println("Email adress:");
        if (TB.hasNext())
            TB.nextLine();

        String email = TB.nextLine();

        System.out.println("Mobilnumer:");
        Long mobilNumer = TB.nextLong();

        System.out.println("Klass:");
        if (TB.hasNext())
            TB.nextLine();

        String klass = TB.nextLine();

        System.out.println("Program:");
        String program = TB.nextLine();

        Elever elev = new Elever(namnElev, personNumer, email, mobilNumer, klass, program);
        return elev;
    }

    static int VALMETOD(boolean klar, int val, Scanner TB, int Minstval, int Störstval) {
    klar = false;
    val = 0;
    while (klar == false) {
        try {
            val = TB.nextInt();
            klar = true;
            if (val < Minstval || val > Störstval) {
                klar = false;
                System.out.println("Ange en sifra som korispoderar till en av valen!");
                System.out.print("Ange: ");
            }
        } catch (InputMismatchException e) {
            System.out.println("Skriv bara in sifror!");
            System.out.print("Ange: ");
            klar = false;
            if (TB.hasNext())
                TB.next();
        }
    }
    klar = false;
    return val;
}

    
}

