package KlasesIrNamuDarbas.Paveldejimas.AutomobiliuNuoma;

public class Automobilis {
    private String marke;
    private String modelis;
    private int metai;
    private double kainaUzDieną;

    public Automobilis(String marke, String modelis, double kainaUzDieną, int metai) {
        this.marke = marke;
        this.modelis = modelis;
        this.kainaUzDieną = kainaUzDieną;
        this.metai = metai;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModelis() {
        return modelis;
    }

    public void setModelis(String modelis) {
        this.modelis = modelis;
    }

    public int getMetai() {
        return metai;
    }

    public void setMetai(int metai) {
        this.metai = metai;
    }

    public double getKainaUzDieną() {
        return kainaUzDieną;
    }

    public void setKainaUzDieną(double kainaUzDieną) {
        this.kainaUzDieną = kainaUzDieną;
    }

    @Override
    public String toString() {
        return "Automobilis{" +
                "marke='" + marke + '\'' +
                ", modelis='" + modelis + '\'' +
                ", metai=" + metai +
                ", kainaUzDiena=" + kainaUzDieną +
                '}';


    }
}
