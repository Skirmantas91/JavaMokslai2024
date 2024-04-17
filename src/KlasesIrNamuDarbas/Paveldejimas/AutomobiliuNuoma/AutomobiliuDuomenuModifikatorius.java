package KlasesIrNamuDarbas.Paveldejimas.AutomobiliuNuoma;

/*Sukurti klasę AutomobiliųDuomenųModifikatorius kurios funkcija gali priimti bet kokio tipo automobili -
jeigu automobilis yra varomas naftos kuru - jam ji turi leisti per parametrus pakeisti sanaudas, jeigu tai elektromobilis -
turi leisti pakeisti jo įkrovimo laiką. Metodą pavadinti modifyParameter arba modifikuotiParametra (edited)

Sukurti papildomą parametrą rida klasėje automobilis. Klasėje AutomobiliųDuomenųModifikatorius pridėti metodą keisti ridą.

Sukurti klasę klientas - Vardas, Pavardė, Dabar Nuomojamas Automobilis,
Paskutinis Nuomotas Automobilis, bei sąrašą automobilių kuriuos ir kiek dienų klientas buvo išsinuomavęs. (Dienos INT)
Sukurti klientų sąrašą.
Sukurti metodą, kuriam padavus klientą ir padavus automobilį jis būtų jam priskiriamas automobilis.
Sukurti metodą pabaigti nuomą, kuris nuimtų Dabar naudojamą automobilį ir pakeistų jį į null.
(nuomojant automobili jis turi iškart atsirasti sąraše kuriuos klientas turi būti išsinuomavęs)
Visas šių metodų valdymas turi būti realizuotas per įvestį.
 */
public class AutomobiliuDuomenuModifikatorius {
    public void modifikuotiParametra(Automobilis automobilis, double naujosReiksmes) {
        if (automobilis instanceof NaftosKuroAutomobilis) {
            ((NaftosKuroAutomobilis) automobilis).setDegaluSuvartojimas100km(naujosReiksmes);
            System.out.println("Degalų sanaudų rodiklis pakeistas " + naujosReiksmes);
        } else if (automobilis instanceof ElektrinisAutomobilis) {
            ((ElektrinisAutomobilis) automobilis).setKrovimoLaikas(naujosReiksmes);
            System.out.println("Krovimo laikas pakeistas " + naujosReiksmes);
        }else System.out.println("Automobilis neturi modifikuotų parametrų" );
    }

    public void keistiRida(Automobilis automobilis, int naujaRida) {
        int senaRida = automobilis.getRida();
        automobilis.setRida(naujaRida);
        System.out.println("Automobilio rida pakeista is" + senaRida + "i " + naujaRida);
    }


}
