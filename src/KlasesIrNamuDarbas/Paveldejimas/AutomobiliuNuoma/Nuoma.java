package KlasesIrNamuDarbas.Paveldejimas.AutomobiliuNuoma;

import java.util.ArrayList;
import java.util.List;
/*Galų gale, parašykite klasę Nuoma, kurioje yra sąrašas su turimais automobiliais.
Sukurti metodus, kurie leistų pridėti naujus automobilius į sąrašą,
pasiimti automobilį iš sąrašo ir apskaičiuoti nuomos kainą už nurodytą dienų skaičių.*/

public class Nuoma {

    private List<Automobilis> automobiliai;

    public Nuoma() {
        this.automobiliai = new ArrayList<>();
    }

    public void pridetiAutomobili(Automobilis automobilis) {
        this.automobiliai.add(automobilis);
    }

    public void pasiimtiAutomobili(Automobilis automobilis) {
        this.automobiliai.remove(automobilis);
    }

    public double nuomosKaina(int dienos, Automobilis automobilis) {
        return dienos * automobilis.getKainaUzDieną();
    }

    public void visoAutoparkoSpausdinimas() {
        System.out.println("Automobilių sąrašas:");
        for (Automobilis automobilis : automobiliai) {
            System.out.println("Markė: " + automobilis.getMarke() + ", Modelis: " + automobilis.getModelis() + ", Metai: " + automobilis.getMetai() + ", Kaina už dieną: " + automobilis.getKainaUzDieną());
        }
    }
}
