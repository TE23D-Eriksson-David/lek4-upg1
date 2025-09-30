import java.util.ArrayList;

public class Klass {
    ArrayList<Elever> Klassen = new ArrayList<Elever>();

    public void läggTillElev(Elever elev){
        Klassen.add(elev);
    }

    public void visaKlass(){
        for (int i = 0; i < Klassen.size(); i++) {
            Elever elev = Klassen.get(i);
            System.out.println();
            System.out.println("Namn: "+elev.namn+"\nPersonumer: "+elev.personNumer+"\nEmail: "+elev.email+"\nMobilnumer: "+elev.mobilNumer+"\nKlass: "+elev.klass+"\nProgram: "+elev.program+"");
        }
        
    }
}
