package KlasesIrNamuDarbas.Paveldejimas.AutomobiliuNuoma;

public class NaftosKuroAutomobilis extends Automobilis {

    private double degaluSuvartojimas100km;

    public NaftosKuroAutomobilis(String marke, String modelis, double kainaUzDieną, int metai, double degaluSuvartojimas100km) {
        super(marke, modelis, kainaUzDieną, metai);

        this.degaluSuvartojimas100km = degaluSuvartojimas100km;
    }

    public double getDegaluSuvartojimas100km() {
        return degaluSuvartojimas100km;
    }

    public void setDegaluSuvartojimas100km(double degaluSuvartojimas100km) {
        this.degaluSuvartojimas100km = degaluSuvartojimas100km;
    }
}
