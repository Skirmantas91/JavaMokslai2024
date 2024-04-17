package KlasesIrNamuDarbas.JavaPraktika.ZaisluParduotuve;
/*Galų gale, parašykite klasę Parduotuvė, kurioje yra sąrašas su turimais žaislais.
Sukurkite metodus, kurie leistų pridėti naujus žaislus į sąrašą,
išimti žaislus iš sąrašo ir apskaičiuoti bendrą žaislų kainą už nurodytą kiekį.*/

import java.util.List;

public class Parduotuve {

    private List<Zaislas> turimiZaislai;

    public Parduotuve(List<Zaislas> turimiZaislai) {
        this.turimiZaislai = turimiZaislai;
    }

    public void pridetiZaislu(Zaislas zaislas) {
        this.turimiZaislai.add(zaislas);
    }

    public void isimtiZaislu(Zaislas zaislas) {
        this.turimiZaislai.remove(zaislas);
    }

   // public double zaisluKaina(int kiekis, Zaislas zaislas){
  //      return
  //  }
}
