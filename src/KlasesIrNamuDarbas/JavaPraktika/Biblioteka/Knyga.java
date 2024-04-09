package KlasesIrNamuDarbas.JavaPraktika.Biblioteka;

public class Knyga {
    private int isleidimoMetai;
    private Autorius autorius;
    private String knygosPavadinimas;

    public Knyga(String knygosPavadinimas, Autorius autorius, int isleidimoMetai) {
        this.knygosPavadinimas = knygosPavadinimas;
        this.autorius = autorius;
        this.isleidimoMetai = isleidimoMetai;
    }

    public int getIsleidimoMetai() {
        return isleidimoMetai;
    }

    public void setIsleidimoMetai(int isleidimoMetai) {
        this.isleidimoMetai = isleidimoMetai;
    }

    public Autorius getAutorius() {
        return autorius;
    }

    public void setAutorius(Autorius autorius) {
        this.autorius = autorius;
    }

    public String getKnygosPavadinimas() {
        return knygosPavadinimas;
    }

    public void setKnygosPavadinimas(String knygosPavadinimas) {
        this.knygosPavadinimas = knygosPavadinimas;
    }

    @Override
    public String toString() {
        return "Knyga: " + knygosPavadinimas + ", Autorius: " + autorius + ", Isleidimo metai: " + isleidimoMetai;
    }


}
