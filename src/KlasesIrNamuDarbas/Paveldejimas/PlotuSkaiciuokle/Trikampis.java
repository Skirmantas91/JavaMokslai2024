package KlasesIrNamuDarbas.Paveldejimas.PlotuSkaiciuokle;

public class Trikampis extends Figura {
    // Konstruktorius
    public Trikampis(double krastine1, double krastine2) {
        super(krastine1, krastine2);
    }

    // Perrašytas skaiciuokPlota() metodas
    @Override
    public void skaiciuokPlota() {
        super.skaiciuokPlota();
        // Atnaujiname plotą pagal trikampio formule (statinės * aukštine / 2)
        plotas /= 2;
    }
}
