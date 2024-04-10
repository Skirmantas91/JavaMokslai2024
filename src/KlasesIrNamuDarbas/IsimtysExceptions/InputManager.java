package KlasesIrNamuDarbas.IsimtysExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Sukurkite sveikųjų skaičių dalybos programą, kuri pilną veiksmą ir rezultatą atspausdina
ekrane: Pvz, jeigu vartotojas įveda skaičius 6 ir 3, programa ekrane turi išvesti: 6 / 3 = 2;

Sukurkite klasę InputManager;

Sukurkite privatų metodą insertDigit(), kuris turi prašyti vartotoją (naudojant Scanner) įvesti
skaičių, o jeigu įvedamas ne skaičius, sugauti InputMismatchException ir paprašyti įvesti
skaičių iš naujo;

Sukurkite metodą askForInput(), kurio viduje iškviečiamas du kartus insertDigit() ir gauti
skaičiai sudedami į String masyvą;

Sukurkite klasę IntDivider ir joje implementuokite metodą:

public int divide(String[] skaiciai) {}

metodo paskirtis - atlikti skaičių dalybą,kur pirmas masyvo skaičius turi būti padalintas iš
antrojo; Jeigu antras skaičius masyve yra nulis, metodas turi išmesti programuotojo sukurtą
ArgumentIsZero exception'à;

Sukurkite ArgumentIsZero exception’ą. Jame perrašykite toString() metodą, kuris grąžintų
aiškų ir suprantamą pranešimą apie tai, kas įvyko; */
public class InputManager {

    int insertDigit() {
        Scanner skaneris = new Scanner(System.in);
        int skaicius = 0;

        try {
            System.out.println("Iveskite skaiciu:");
            skaicius = skaneris.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Klaida - įveskite teisingą reikšmę");
            skaneris.nextLine();
            skaicius = insertDigit();
        }

        return skaicius;
    }


}
