package KlasesIrNamuDarbas.KlasesIrObjektai.Uzduotis1;

/*+Sukurkite klasę Darbuotojas su savo privačiais
kintamaisiais vardas, pavardė, asmens kodas, amžius,
pareigos įmonėje, darbo patirtis (metais).

+Modifikuokite konstruktorių. Kuriant naują darbuotoją
turi būti suteikiamos reikšmės vardas, pavardė ir asmens
kodas laukams.

+Sukurkite geterius visiems privatiems laukams.

+Sukurkite seterius laukams pareigos ir patirtis.

Sukurkite privatų metodą, kuris pagal asmens kodą,
automatiškai nustatytų darbuotojo amžių ir reikšmę
priskirtų atitinkamam laukui.

Iškvieskite šį metodą konstruktoriaus viduje.*/
public class Darbuotojas {
    private String vardas;
    private String pavarde;
    private long asmensID;
    private int amzius;
    private String pareigos;
    private int darboPatirtis;

    //konstruktorius
    public Darbuotojas(String vardas, String pavarde, long asmensID, int amzius, String pareigos, int darboPatirtis) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.asmensID = asmensID;
        this.amzius = amzius;
        this.pareigos = pareigos;
        this.darboPatirtis = darboPatirtis;
    }

    public String getVardas() {
        return vardas;
    }


    public String getPavarde() {
        return pavarde;
    }

    public long getAsmensID() {
        return asmensID;
    }

    public int getAmzius() {
        return amzius;
    }

    public String getPareigos() {
        return pareigos;
    }

    public void setPareigos(String pareigos) {
        this.pareigos = pareigos;
    }

    public int getDarboPatirtis() {
        return darboPatirtis;
    }

    public void setDarboPatirtis(int darboPatirtis) {
        this.darboPatirtis = darboPatirtis;
    }


}
