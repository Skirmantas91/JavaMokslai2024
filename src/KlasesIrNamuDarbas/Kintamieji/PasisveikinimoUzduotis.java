package KlasesIrNamuDarbas.Kintamieji;

/*
+Sukurkite du kintamuosius - pasisveikinimas anglų
kalba ir pasisveikinimas korėjiečių kalba (jeigu
nežinote tos kalbos pasisveikinimo, kintamąjį palikite
be reikšmės);

+Patikrinkite kokios klasės instancai yra šie kintamieji;

+Suskaičiuokite kiek raidžių yra antrame Stringe.
+Kelinta yra h raidė antrame Stringe? Sujunkite abu
Stringus į vieną ir atspausdinkite gauto žodžio 3-7
pozijoje esančias raides kaip naują žodį.
 */
public class PasisveikinimoUzduotis {
    public static void main(String[] args) {
        String pasisveikinimasEN = "hello";
        String pasisveikinimasKR = "annyeonghaseyo";
        int raidesPozicija = pasisveikinimasKR.indexOf('h');

        System.out.println(pasisveikinimasEN.getClass().getName() + "Kintamijo EN klase");
        System.out.println(pasisveikinimasKR.getClass().getName() + "Kintamijo KR klase");

        System.out.println("Kelinta raide h ? " + pasisveikinimasKR.indexOf('h'));

        if (raidesPozicija != -1) {
            System.out.println("H raidės pozicija " + raidesPozicija);
        }
        else {
            System.out.println("raides nera");
        }

        System.out.println("raidziu skaicius zodyje annyeonghaseyo " + pasisveikinimasKR.length());
        String naujasZodis = pasisveikinimasEN+pasisveikinimasKR;
        System.out.println("" + naujasZodis.charAt(3)+naujasZodis.charAt(7));

    }
}

