package KlasesIrNamuDarbas.IsimtysExceptions.DalybosPrograma;
/*Sukurkite klasę IntDivider ir joje implementuokite metodą:

public int divide(String[] skaiciai) {}

metodo paskirtis - atlikti skaičių dalybą,kur pirmas masyvo skaičius turi būti padalintas iš
antrojo; Jeigu antras skaičius masyve yra nulis, metodas turi išmesti programuotojo sukurtą
ArgumentIsZero exception'à;

Sukurkite ArgumentIsZero exception’ą. Jame perrašykite toString() metodą, kuris grąžintų
aiškų ir suprantamą pranešimą apie tai, kas įvyko; */
public class IntDivider {
    public static int divide(String[] skaiciai) throws ArgumentIsZeroException {
        int sk1 = Integer.parseInt(skaiciai[0]);
        int sk2 = Integer.parseInt(skaiciai[1]);

        if (sk2 == 0) {
            throw new ArgumentIsZeroException(); // Išmesti klaidą, jei antras skaičius yra nulis
        }

        return sk1 / sk2;
    }

}
