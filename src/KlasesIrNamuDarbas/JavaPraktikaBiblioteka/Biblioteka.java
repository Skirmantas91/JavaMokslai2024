package KlasesIrNamuDarbas.JavaPraktikaBiblioteka;

import java.util.ArrayList;
import java.util.List;

public class Biblioteka {
    //Sukuriamas sarasas
    List<Knyga> knyguSarasas = new ArrayList<>();

    //Sukuriamas metodas prideti knyga
    public void pridetiKnyga(Knyga knyga) {
        knyguSarasas.add(knyga);
    }

    //Spausdinimo metodas
    public void spausdintiKnyguSarasa() {
        System.out.println("Knygu sarsas:");
        for (Knyga knyga : knyguSarasas) {
            System.out.println(knyga.toString());
        }
    }
}




