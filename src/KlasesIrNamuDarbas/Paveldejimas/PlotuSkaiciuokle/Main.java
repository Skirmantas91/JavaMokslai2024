package KlasesIrNamuDarbas.Paveldejimas.PlotuSkaiciuokle;

public class Main {
    public static void main(String[] args) {

        IOManager ioManager = new IOManager();

        ioManager.suzinokFigura();
        ioManager.suzinokKrastines();

        Figura figura = null;
        if (ioManager.getPasirinktaFigura() == 1) {
            figura = new Kvadratas(ioManager.getKrastine1());
        } else if (ioManager.getPasirinktaFigura() == 2) {
            figura = new Trikampis(ioManager.getKrastine1(), ioManager.getKrastine2());
        } else if (ioManager.getPasirinktaFigura() == 3) {
            figura = new Skritulys(ioManager.getKrastine1());
        }

        if (figura != null) {
            figura.skaiciuokPlota();
            ioManager.spausdinkPlota(figura.toString());
        }

    }
}
