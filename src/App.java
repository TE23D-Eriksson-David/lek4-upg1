import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner TB = new Scanner(System.in);
        Klass klass = new Klass();

        while (true) {
            klass.läggTillElev(registreraElev(TB));
            klass.visaKlass();
        }
    }

    static Elever registreraElev(Scanner TB) {

        System.out.println("Registrera en elev genom att fylla i följande information:");
        System.out.println("1. Namn\n2. Person Numer\n3. Email\n4. Mobilnumer\n5. Klass\n6. Program\n");

        System.out.println("Namn:");
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
}
