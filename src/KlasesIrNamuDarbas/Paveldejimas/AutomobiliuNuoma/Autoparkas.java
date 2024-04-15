package KlasesIrNamuDarbas.Paveldejimas.AutomobiliuNuoma;

import java.util.ArrayList;
import java.util.List;

public class Autoparkas {
    private List<Automobilis> automobiliuSarasas;

    public Autoparkas() {
        this.automobiliuSarasas = new ArrayList<>();
    }

    public void pridetiAutomobili(Automobilis automobilis) {
        this.automobiliuSarasas.add(automobilis);
    }

    public List<Automobilis> gautiAutoparka() {
        return this.automobiliuSarasas;
    }

}
