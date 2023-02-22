package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {

        /*
        zofka.setLocation(150, 150);
        BarevnyCtverec(100, Color.black);

        zofka.setLocation(300,150);
        BarevnyTrojuhelnik(100, Color.darkGray);

        zofka.setLocation(450, 150);
        BarevnyObdelnik(100, 200, Color.gray);

        zofka.setLocation(700, 100);
        BarevneKolecko(5, Color.lightGray);

        zofka.setLocation(115, 300);

  */
        Zmrzlina();

        Snehulak();



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

    public void Zmrzlina () {
        zofka.setLocation(115, 500);
        BarevneKolecko(8, Color.pink);
        zofka.turnRight(90);
        zofka.setLocation(113, 515);
        BarevnyTrojuhelnik(187, Color.orange);
        }

     public void Snehulak ()  {
         zofka.setLocation(602, 300);
         BarevneKolecko(4, Color.cyan);
         zofka.setLocation(600, 400);
         BarevneKolecko(6, Color.cyan);
         zofka.setLocation(598, 540);
         BarevneKolecko(8, Color.cyan);

             //ruce
             zofka.setLocation(505, 430);
             BarevneKolecko(2, Color.cyan);
             zofka.setLocation(695, 430);
             BarevneKolecko(2, Color.cyan);

             //mrkev
             zofka.setLocation(595, 350);
             BarevnyTrojuhelnik(20, Color.red);

             //oci
            zofka.setLocation(585,320);
            BarevneKolecko(0.25, Color.black);
            zofka.penUp();
            zofka.move(38);
            zofka.penDown();
            BarevneKolecko(0.25, Color.black);
         }








    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
