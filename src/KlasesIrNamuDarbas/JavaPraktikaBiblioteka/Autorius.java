package KlasesIrNamuDarbas.JavaPraktikaBiblioteka;

public class Autorius {
    private String vardas;
    private String pavarde;
    private int gimimoMetai;

    public Autorius(String vardas, String pavarde, int gimimoMetai) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.gimimoMetai = gimimoMetai;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public int getGimimoMetai() {
        return gimimoMetai;
    }

    public void setGimimoMetai(int gimimoMetai) {
        this.gimimoMetai = gimimoMetai;
    }

    @Override
    public String toString() {
        return vardas + " " + pavarde + " (" + gimimoMetai + ")";
    }

}
