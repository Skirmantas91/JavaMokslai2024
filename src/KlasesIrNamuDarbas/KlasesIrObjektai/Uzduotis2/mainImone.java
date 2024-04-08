package KlasesIrNamuDarbas.KlasesIrObjektai.Uzduotis2;
/*Sukurkite klasę su main metodu. Joje sukurkite
darbuotojų, pridėkite juos į įmonę.*/

import java.util.ArrayList;
import java.util.List;

public class mainImone {
    public static void main(String[] args) {
        List<String> sarasas = new ArrayList<>();

    Imone naujaImone = new Imone("VCS", 1998);
    naujaImone.naujasDarbuotojas("Petras", "Petrauskas","Programuotojas",1);
    naujaImone.naujasDarbuotojas("Jonas", "Jonauskas","Programuotojas",1);

    System.out.println(naujaImone.getDarbuotojuSarasas());
    }

}
