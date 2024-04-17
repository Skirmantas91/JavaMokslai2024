package KlasesIrNamuDarbas.JavaPraktika.ZaisluParduotuve;

public class Konstruktorius extends Zaislas{

    private int detalesSkaicius;

    public Konstruktorius(String pavadinimas, String gamintojas, int amziausRiba, double kaina, int detalesSkaicius) {
        super(pavadinimas, gamintojas, amziausRiba, kaina);
        this.detalesSkaicius = detalesSkaicius;
    }

    public int getDetalesSkaicius() {
        return detalesSkaicius;
    }

    public void setDetalesSkaicius(int detalesSkaicius) {
        this.detalesSkaicius = detalesSkaicius;
    }

    //konstruktoriai turi detalės skaičių
}
