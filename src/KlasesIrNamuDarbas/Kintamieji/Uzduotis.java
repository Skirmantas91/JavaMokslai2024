package KlasesIrNamuDarbas.Kintamieji;


public class Uzduotis {
    public static void main(String[] args) {
        //sukurkite kintamąjį, kurio reikšmė jūsų vardo raidžių skaičius;
        int manoVardoRaidziuSkaicius = 10;
        System.out.println("Vardo raides " + manoVardoRaidziuSkaicius);
        //sukurkite kintamąjį, kurio reikšmė šios dienos degalų kaina už litrą;
        float degaluKaina = 1.45F;
        System.out.println("Degalu kaina " + degaluKaina);
        //sukurkite kintamąjį, kurio reikšmė dviejų turimų kintamųjų suma;
        float kintamujuSuma = manoVardoRaidziuSkaicius + degaluKaina;
        System.out.println("Turimu kintamuju suma " + kintamujuSuma);
        //sukurkite kintamąjį, kurio reikšmė ar turima suma teigiama?;
        boolean arTurimaReiksmeTeigiama = true;
        System.out.println("Ar teigiama " + arTurimaReiksmeTeigiama);
        //sukurkite kintamąjį, kurio reikšmė jūsų vardo pirmoji raidė;
        char vardoPirmojiRaide = 'S';
        System.out.println("Vardo raide pirma " + vardoPirmojiRaide);
        //iš pirmojo kintamojo atimkite paskutinį kintamąjį ir rezultatą
        //pridėkite prie sumos;
        double suma = manoVardoRaidziuSkaicius - vardoPirmojiRaide;
        System.out.println("Suma" + suma);
        //ar suma vis dar teigiama?;
        boolean arVisDarTeigiama = suma > 0;
        System.out.println("Ar teigiama " + arVisDarTeigiama);
        //sužinokite savo pirmos raidės char’o numerį */
        int charNumeris = (int) vardoPirmojiRaide;
        System.out.println("Char pirmos raides numeris: " + charNumeris);
    }
}
