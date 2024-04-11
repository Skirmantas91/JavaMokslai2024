package KlasesIrNamuDarbas.Paveldejimas.PlotuSkaiciuokle;

public class Figura {
        public double plotas;
        private double krastine1;
        private double krastine2;

    public Figura(double krastine1, double krastine2) {
        this.krastine1 = krastine1;
        this.krastine2 = krastine2;
    }

    public double getKrastine1() {
        return krastine1;
    }

    public double getKrastine2() {
        return krastine2;
    }

    public double getPlotas() {
        return plotas;
    }

    public void setPlotas(double plotas) {
        this.plotas = plotas;
    }

    public void skaiciuokPlota() {
        plotas = krastine1 * krastine2;
    }

    // Perrašytas toString() metodas
    @Override
    public String toString() {
        return "Jūsų figūros plotas yra " + plotas + " kv.cm";
    }

}
