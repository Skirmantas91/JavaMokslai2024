package KlasesIrNamuDarbas.Paveldejimas.PlotuSkaiciuokle;/*Sukurkite klasę PlotuSkaiciuokle.Skritulys, kuri paveldi iš klasės PlotuSkaiciuokle.Figura;
▪ Modifikuokite privalomą konstruktorių, kad jam reiktų paduoti tik vieną skaičių(skritulio spindulį);
▪ Perrašykite metodą skaiciuokPlota().
Norint suskaičiuoti skritulio plotą,
reikia turimąspindulį pakelti kvadratu ir padauginti iš PI (naudokite reikšmę Math.PI);
Gautą plotoreikšmę, suapvalinkite - paverksite ją BigDecimal objektu,
iškvieskite objekto metodąsetScale(2, RoundingMode.UP);
Suapvalintą reikšmę išsaugokite ir perduokite į superklasės kintamąjį vėl kaip primityvą,
o ne objektą. ▪ Papildykite PlotuSkaiciuokle.IOManager metodus, kad vartotojas galėtų rinktis skritulį ir įvesti jospindulį.
▪ Papildykite PlotuSkaiciuokle klasę main metode skaičiuodami skritulio plotą */


import java.math.BigDecimal;

public class Skritulys extends Figura {

    public Skritulys(double spindulys) {
        super(spindulys, 0);
    }

    @Override
    public void skaiciuokPlota() {
        double plotas = Math.PI * getKrastine1() * getKrastine1();
        BigDecimal rounded = BigDecimal.valueOf(plotas).setScale(2, BigDecimal.ROUND_HALF_UP);
        setPlotas(rounded.doubleValue());
    }
}
