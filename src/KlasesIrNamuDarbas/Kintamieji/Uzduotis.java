package KlasesIrNamuDarbas.Kintamieji;

/*sukurkite kintamąjį, kurio reikšmė jūsų vardo raidžių skaičius;

sukurkite kintamąjį, kurio reikšmė šios dienos degalų kaina už
litrą;

sukurkite kintamąjį, kurio reikšmė dviejų turimų kintamųjų suma;

sukurkite kintamąjį, kurio reikšmė ar turima suma teigiama?;

sukurkite kintamąjį, kurio reikšmė jūsų vardo pirmoji raidė;

iš pirmojo kintamojo atimkite paskutinį kintamąjį ir rezultatą
pridėkite prie sumos;

ar suma vis dar teigiama?;

sužinokite savo pirmos raidės char’o numerį */
public class Uzduotis {
    public static void main(String[] args) {
        int manoVardoRaides = 10;
        double degaluKaina = 1.45;
        double turimuKintamujuSuma = manoVardoRaides + degaluKaina;
        int skaicius1 = 10;
        int skaicius2 = 20;
        int skaiciuSUma = skaicius1 + skaicius2;
        char manoVardoRaide = 'S';
        double rezultatas = 0;
        boolean arSumaVisDarTeigiama = rezultatas > 0;
        System.out.println("Mano vardą sudaro raidžių: " + manoVardoRaides);
        System.out.println("Šiso dienos degalų kainą " + degaluKaina);
        System.out.println("Turimu kintamuju suma = " + turimuKintamujuSuma);
        System.out.println("Kintamuju skaiciu suma = " + skaiciuSUma);
        System.out.println("Mano vardo pirma raide " + manoVardoRaide);
        System.out.println(rezultatas = skaicius1 - skaicius2);
        System.out.println(rezultatas + skaiciuSUma);
    }
}
