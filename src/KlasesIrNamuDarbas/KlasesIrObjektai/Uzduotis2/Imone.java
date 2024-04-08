package KlasesIrNamuDarbas.KlasesIrObjektai.Uzduotis2;

import java.util.ArrayList;
import java.util.List;

/*Sukurkite klasę Imone, su privačiais laukais
+pavadinimas, įkūrimo metai, darbuotojų sąrašas;

+Modifikuokite konstruktorių. Kuriant įmonę suteikiamos
reikšmės laukams pavadinimas ir įkūrimo metai bei
inicijuojamas tuščias darbuotojų sąrašas.

+Sukurkite geterius visiems privatiems laukams.

+Sukurkite metodą, kuris leistų pridėti naują darbuotoją į
įmonės sąrašą suteikiant tam darbuotojui pareigas
įmonėje ir užfiksuojant jo turimą darbo patirtį.

Sukurkite klasę su main metodu. Joje sukurkite
darbuotojų, pridėkite juos į įmonę.

Sukurkite filtravimo metodą, kuris atspausdina ekrane tik
tuos darbuotojus, kurių darbo stažas didesnis nei X metų
(X perduodamas per parametrus).*/
public class Imone {
    private String pavadinimas;
    private int ikurimoMetai;
    private List<String> darbuotojuSarasas;




    //sukrutas konstruktorius
    public Imone(String pavadinimas, int ikurimoMetai) {
        this.pavadinimas = pavadinimas;
        this.ikurimoMetai = ikurimoMetai;
        this.darbuotojuSarasas = new ArrayList<>();
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public int getIkurimoMetai() {
        return ikurimoMetai;
    }

    public List<String> getDarbuotojuSarasas() {
        return darbuotojuSarasas;
    }

    //Sukurtas metodas
    public void naujasDarbuotojas(String vardas, String pavarde, String pareigos, int patirtis) {
        darbuotojuSarasas.add(vardas + ", " + pavarde + ", " + pareigos + ", " + patirtis);

    }

}
