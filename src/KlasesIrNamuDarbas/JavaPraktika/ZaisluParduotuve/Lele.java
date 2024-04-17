package KlasesIrNamuDarbas.JavaPraktika.ZaisluParduotuve;

public class Lele extends Zaislas {

    private SukuosenosTipas sukuosenosTipas;

    public Lele(String pavadinimas, String gamintojas, int amziausRiba, double kaina, SukuosenosTipas sukuosenosTipas) {
        super(pavadinimas, gamintojas, amziausRiba, kaina);
        this.sukuosenosTipas = sukuosenosTipas;
    }

    public SukuosenosTipas getSukuosenosTipas() {
        return sukuosenosTipas;
    }

    public void setSukuosenosTipas(SukuosenosTipas sukuosenosTipas) {
        this.sukuosenosTipas = sukuosenosTipas;
    }
}
