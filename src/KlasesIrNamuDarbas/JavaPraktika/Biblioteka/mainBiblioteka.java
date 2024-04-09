package KlasesIrNamuDarbas.JavaPraktika.Biblioteka;
/*Bibliotekos aplikacija:

Sukurti klasę Autorius. Autorius turi vardą, pavardę, gimimo metus.

Sukurti klasę Knyga, kuri turi išleidimo metus, autorių bei pavadinimą.

Sukurti klasę Biblioteka, kuri turi knygų sąrašą. Klasėje turi būti pridėjimo
į sąrašą metodas ir gražaus knygos iš sąrašo spausdinimo metodas.

Klasėje su main metodu pridėkite naujų knygų į biblioteką ir atspausdinkite
knygų sąrašą ekrane. (Darome prielaidą, kad vieną konkrečią knygą parašė vienas autorius).


Jei susipažinote su klasėmis Paths ir Files atliekame sekančią užduotį:
Ašsaugoti visą knygų sąrašą projekto šakninėje direktorijoje pavadinimu knygos.txt */

public class mainBiblioteka {
    public static void main(String[] args) {

        Autorius autorius1  = new Autorius("Petras","Petraitis", 1991);
        Knyga knyga1 = new Knyga("Java",autorius1,1980);


        Autorius autorius2  = new Autorius("Petras","Petraitis", 1991);
        Knyga knyga2 = new Knyga("Phyton",autorius2,2024);


        Biblioteka biblioteka = new Biblioteka();
        biblioteka.pridetiKnyga(knyga1);
        biblioteka.pridetiKnyga(knyga2);

        biblioteka.spausdintiKnyguSarasa();

    }
}
