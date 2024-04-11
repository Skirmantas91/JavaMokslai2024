package KlasesIrNamuDarbas.Paveldejimas.PlotuSkaiciuokle;

import java.util.Scanner;

public class IOManager {
    private  int pasirinktaFigura;
    private double krastine1;
    private double krastine2;

    public int getPasirinktaFigura() {
        return pasirinktaFigura;
    }

    public double getKrastine1() {
        return krastine1;
    }

    public double getKrastine2() {
        return krastine2;
    }

    public void suzinokFigura() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pasirinkite figūrą: (1 - PlotuSkaiciuokle.Kvadratas, 2 - PlotuSkaiciuokle.Trikampis, 3 - PlotuSkaiciuokle.Skritulys)");
        pasirinktaFigura = scanner.nextInt();
    }

    public void suzinokKrastines() {
        Scanner scanner = new Scanner(System.in);
        if (pasirinktaFigura == 1) {
            System.out.println("Įveskite kvadrato kraštinės ilgį:");
            krastine1 = scanner.nextDouble();
        }
        else if (pasirinktaFigura == 2) {
            System.out.println("Įveskite trikampio pirmos statinės ilgį:");
            krastine1 = scanner.nextDouble();
            System.out.println("Įveskite trikampio antros statinės ilgį:");
            krastine2 = scanner.nextDouble();
        } else if (pasirinktaFigura == 3) {
            System.out.println("Įveskite skritulio spindulį:");
            krastine1 = scanner.nextDouble();
        } else {
            System.out.println("Tokios figūros plotas neskaičiuojamas");
        }
    }

    public void spausdinkPlota(String str) {
        System.out.println(str);
    }
}
