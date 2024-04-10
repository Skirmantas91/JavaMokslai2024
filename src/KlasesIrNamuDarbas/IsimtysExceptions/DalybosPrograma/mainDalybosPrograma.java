package KlasesIrNamuDarbas.IsimtysExceptions.DalybosPrograma;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

public class mainDalybosPrograma {
    public static void main(String[] args) {

        InputManager inputManager = new InputManager();
        String[] skaiciai = inputManager.askForInput();
        try {
            int result = IntDivider.divide(skaiciai);
            System.out.println("Dalybos rezultatas: " + result);
        } catch (ArgumentIsZeroException e) {
            System.out.println("Klaida: " + e.toString());
        }

    }

}
