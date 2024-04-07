package KlasesIrNamuDarbas.Kintamieji;

// +Sukurkite klasę Katinas;
//+Klasės viduje sukurkite klasės kintamuosius (field’us) - vardas, amzius,
//+arSkiepytas;
//+Sukurkite katino tipo kintamąjį (objektą);
//+Suteikite objekto kintamiesiems (field’ams) reikšmes;
//+Gražiai (atskirose eilutėse) atspausdinkite ekrane katino vardą, amžių,
//+informaciją apie skiepą;
//+Sukurkite dar vieną katino tipo kintamąjį (objektą) ir priskirkite jo
//+kintamiesiesm reikšmes (atspausdinkite);

public class KatinuUzduotis {
    public static void main(String[] args) {
        //Pirmas katino Objektas
        Katinas murkis = new Katinas();
        murkis.Vardas = "Murkis";
        System.out.println("Vardas: " + murkis.Vardas);
        murkis.Amzius = 7;
        System.out.println("Amzius: " + murkis.Amzius);
        murkis.ArSkiepytas = true ;

        String skiepas;
        if (murkis.ArSkiepytas == true)
            skiepas = "Skiepytas";
        else
            skiepas = "Neskiepytas";
        System.out.println("Ar skiepytas? " + skiepas);

        //Antras katino objektas
        System.out.println("---------------------------");
        Katinas dzeris = new Katinas();
        dzeris.Vardas = "Dzeris";
        System.out.println("Vardas: " +dzeris.Vardas);
        dzeris.Amzius = 5;
        System.out.println("Amzius: " + dzeris.Amzius);
        dzeris.ArSkiepytas = false;

        if (dzeris.ArSkiepytas == true)
            skiepas = "Skiepytas";
        else
            skiepas = "Neskiepytas";
        System.out.println("Ar skiepytas? " + skiepas);
    }

    public static class Katinas {
        String Vardas;
        int Amzius;
        boolean ArSkiepytas;

    }
}
