package KlasesIrNamuDarbas.KodoLogika;

/*Užduotis “Fizz Buzz”.

Klasikinis variantas:

Atspausdinkite skaičius nuo 1 iki 100, tačiau vietoj skaičių, kurie
dalinasi iš 3 atspausdinkit žodį “FIZZ”, vietoj skaičių, kurie dalinasi iš
5, atspausdinkit žodį “BUZZ”, vietoj tų, kurie dalinasi ir iš 3, ir iš 5 -
“FIZZBUZZ”

Pvz:

1

2

FIZZ

4

BUZZ

…….....

14

FIZZBUZZ

16

……… etc */
public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIZZBUZZ");
            } else if (i % 3 == 0) {
                System.out.println("FIZZ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");
            } else
                System.out.println(i);
        }

    }
}
