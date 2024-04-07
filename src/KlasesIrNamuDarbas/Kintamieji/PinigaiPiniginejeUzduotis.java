package KlasesIrNamuDarbas.Kintamieji;
/* +Deklaruokite kintamąjį pinigaiPinigineje;

+Sukurkite atsitiktinį (random) skaičių tarp 12.56 ir
30.43;

+Priskirkite atsitiktinę reikšmę turimam kintam;

+Pagal šios dienos degalų kainą, jums reikia
nusipirkti 20 litrų degalų;

+Ar užteks piniginėje esančių pinigų?

+Kiek pinigų trūksta/lieka piniginėje?

+Visas reikšmes atspausdinkite konsolėje.*/

import java.util.Random;

public class PinigaiPiniginejeUzduotis {
    public static void main(String[] args) {
        double pinigaiPinigineje;
        Random random = new Random();
        double randomSkaicius = 12.56 + (30.43 - 12.56) * random.nextDouble();
        pinigaiPinigineje = randomSkaicius;
        double degaluKaina = 0.45;
        double degaluKiekisLitrais = 20;
        double atsakymas = pinigaiPinigineje - (degaluKiekisLitrais * degaluKaina);
        System.out.println(randomSkaicius);
        if (atsakymas >= 0) {
            System.out.println("Liko pinigų" + atsakymas);
        } else {
        System.out.println("Pinigu nepakanka" + atsakymas);
        }

    }
}
