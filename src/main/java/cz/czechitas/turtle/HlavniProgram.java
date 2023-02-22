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
       // Zmrzlina();

        //Snehulak();

        Masinka();





    }




    private void BarevnyCtverec(double delkaStrany, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 4; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(90);
        }
    }

    private void BarevnyTrojuhelnik(double delkaStrany, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 3; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(120.0);

        }
    }

    private void BarevnyObdelnik(double delkaStranyA,double delkaStranyB, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 2; i++) {
            zofka.move(delkaStranyA);
            zofka.turnRight(90);
            zofka.move(delkaStranyB);
            zofka.turnRight(90);
        }
    }

   private void BarevneKolecko (double delkaStrany, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 72; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(5);
        }
    }

    private void Zmrzlina () {
        zofka.setLocation(115, 500);
        BarevneKolecko(8, Color.pink);
        zofka.turnRight(90);
        zofka.setLocation(113, 515);
        BarevnyTrojuhelnik(187, Color.orange);
        zofka.turnLeft(90);
        }

     private void Snehulak () {
         zofka.turnRight(90);
         zofka.setLocation(602, 300);
         BarevneKolecko(4, Color.cyan);
         zofka.setLocation(600, 400);
         BarevneKolecko(6, Color.cyan);
         zofka.setLocation(598, 540);
         BarevneKolecko(8, Color.cyan);
         Ruce();
         Mrkev();
         Oci();
         zofka.turnLeft(90);
     }
             private void Ruce () {
             zofka.setLocation(505, 430);
             BarevneKolecko(2, Color.cyan);
             zofka.setLocation(695, 430);
             BarevneKolecko(2, Color.cyan);
            }

            private void Mrkev () {
             zofka.setLocation(595, 350);
             BarevnyTrojuhelnik(20, Color.red);
             }

             private void Oci () {
            zofka.setLocation(585,320);
            BarevneKolecko(0.25, Color.black);
            zofka.penUp();
            zofka.move(38);
            zofka.penDown();
            BarevneKolecko(0.25, Color.black);
         }

         private  void Masinka () {
             zofka.setLocation(950, 650);
             BarevnyObdelnik(130, 270, Color.black);
             zofka.turnRight(90);
             Napravy();
             BudkaStrojvedouci();
             CowCatcher();
         }
             private void Napravy () {
                 zofka.move(70);
                 BarevneKolecko(3.85, Color.black);
                 zofka.move(120);
                 BarevneKolecko(3.85, Color.black);
             }

             private void BudkaStrojvedouci () {
                 zofka.move(80);
                 zofka.turnLeft(90);
                 BarevnyObdelnik(270, 180, Color.black);
                 BarevneKolecko(8, Color.black);
             }

             private void CowCatcher () {
                zofka.turnLeft(90);
                zofka.move(270);
                zofka.turnRight(90);

             }




    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
