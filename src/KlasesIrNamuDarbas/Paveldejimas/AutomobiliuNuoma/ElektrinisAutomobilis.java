package KlasesIrNamuDarbas.Paveldejimas.AutomobiliuNuoma;

public class ElektrinisAutomobilis extends Automobilis{

    private double krovimoLaikas;

    public ElektrinisAutomobilis(String marke, String modelis, double kainaUzDieną, int metai, double krovimoLaikas) {
        super(marke, modelis, kainaUzDieną, metai);

        this.krovimoLaikas = krovimoLaikas;
    }

    public double getKrovimoLaikas() {
        return krovimoLaikas;
    }

    public void setKrovimoLaikas(double krovimoLaikas) {
        this.krovimoLaikas = krovimoLaikas;
    }
}
