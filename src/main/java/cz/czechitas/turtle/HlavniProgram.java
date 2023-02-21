package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {

        zofka.setLocation(150, 150);
        BarevnyCtverec(100, Color.ORANGE);

        zofka.setLocation(300,150);
        BarevnyTrojuhelnik(100, Color.GREEN);

        zofka.setLocation(450, 150);
        BarevnyObdelnik(100, 200, Color.pink);

        zofka.setLocation(700, 100);
        BarevneKolecko(5, Color.red);
    }

    public void BarevnyCtverec(double delkaStrany, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 4; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(90);
        }
    }

    public void BarevnyTrojuhelnik(double delkaStrany, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 3; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(120.0);
        }
    }

    public void BarevnyObdelnik(double delkaStranyA,double delkaStranyB, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 2; i++) {
            zofka.move(delkaStranyA);
            zofka.turnRight(90);
            zofka.move(delkaStranyB);
            zofka.turnRight(90);
        }
    }

   public void BarevneKolecko (double delkaStrany, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 72; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(5);
        }
    }




    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
