package KlasesIrNamuDarbas.Paveldejimas.AutomobiliuNuoma;
/*Sukurkite automobilių nuomos sistemą. Jums reikės sukurti pagrindinę klasę Automobilis, kuri turės šiuos atributus:
marke, modelis, metai ir kaina už dieną.
Sukurkite reikiamus getterius ir setterius, taip pat konstruktorių,
leidžiantį sukurti automobilio objektą su nurodytais atributais.

Toliau sukurti dvi subklases, NaftosKuroAutomobilis ir ElektrinisAutomobilis.
Kiekviena subklasė turi papildomą atributą,
pavyzdžiui, degalų suvartojimas 100 km atstumu arba baterijos krovimo laikas.
Taip pat, kiekviena subklasė turi turėti savo konstruktorių,
kuris prideda šiuos papildomus atributus, ir tinkamus getterius ir setterius.

Galų gale, parašykite klasę Nuoma, kurioje yra sąrašas su turimais automobiliais.
Sukurti metodus, kurie leistų pridėti naujus automobilius į sąrašą,
pasiimti automobilį iš sąrašo ir apskaičiuoti nuomos kainą už nurodytą dienų skaičių.

Pridėti viso autoparko atspausdinimą. Susikūrus klasę autoparkas prisidėti sąrašą automobilių.*/

import java.awt.*;
import java.sql.SQLOutput;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Nuoma nuoma = new Nuoma();

        NaftosKuroAutomobilis auto1 = new NaftosKuroAutomobilis("Toyota", "Corolla", 2018, 50, 6.5);
        ElektrinisAutomobilis auto2 = new ElektrinisAutomobilis("Tesla", "Model S", 2020, 100, 80);

        nuoma.pridetiAutomobili(auto1);
        nuoma.pridetiAutomobili(auto2);

        nuoma.visoAutoparkoSpausdinimas();

        System.out.println("Nuomos kaina: " + nuoma.nuomosKaina(3, auto1));
        System.out.println("Nuomos kaina: " + nuoma.nuomosKaina(3, auto2));


        AutomobiliuDuomenuModifikatorius modifikatorius = new AutomobiliuDuomenuModifikatorius();

        modifikatorius.modifikuotiParametra(auto1, 999);
        modifikatorius.modifikuotiParametra(auto2, 555);

    }
}
