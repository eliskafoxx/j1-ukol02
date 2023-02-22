package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {


        zofka.setLocation(150, 150);
        BarevnyCtverec(100, Color.black);

        zofka.setLocation(300,150);
        BarevnyTrojuhelnik(100, Color.darkGray);

        zofka.setLocation(450, 150);
        BarevnyObdelnik(100, 200, Color.gray);

        zofka.setLocation(700, 100);
        BarevneKolecko(5, Color.lightGray);

        zofka.setLocation(950, 150);
        PravouhlyTrojuhelnik(100, 200, Color.pink);

        zofka.setLocation(115, 300);


        Zmrzlina();

        Snehulak();

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

    private void PravouhlyTrojuhelnik (double odvesna, double prepona, Color barva) {
        prepona = Math.sqrt(2*Math.pow(odvesna, 2));
        zofka.setPenColor(barva);

        zofka.move(odvesna);
        zofka.turnLeft(135);
        zofka.move(prepona);
        zofka.turnLeft(135);
        zofka.move(odvesna);
        zofka.turnLeft(90);



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
             BarevnyObdelnik(130, 270, Color.blue);
             zofka.turnRight(90);
             Napravy();
             BudkaStrojvedouci();
             CowCatcher();
             Komin();
             Bago ();
         }

             private void Napravy () {
                zofka.penUp();
                 zofka.move(70);
                 zofka.penDown();
                 BarevneKolecko(3.85, Color.black);
                 zofka.penUp();
                 zofka.move(120);
                 zofka.penDown();
                 BarevneKolecko(3.85, Color.black);
             }

             private void BudkaStrojvedouci () {
                zofka.penUp();
                 zofka.move(80);
                 zofka.penDown();
                 zofka.turnLeft(90);
                 BarevnyObdelnik(270, 180, Color.blue);
                 BarevneKolecko(8, Color.black);
             }

             private void CowCatcher () {
                zofka.turnLeft(90);
                zofka.penUp();
                zofka.move(270);
                zofka.penDown();
                zofka.turnLeft(90);
                zofka.penUp();
                zofka.move(40);
                zofka.turnRight(180);
                zofka.penDown();
                PravouhlyTrojuhelnik (130, 270, Color.red);
             }

             private void Komin () {
            zofka.penUp();
            zofka.move(170);
            zofka.turnRight(90);
            zofka.move(100);
            zofka.turnLeft(180);
            zofka.penDown();
            BarevnyObdelnik(50,150,Color.black);
            zofka.turnRight(90);
            zofka.penUp();
            zofka.move(150);
             }

             private void Bago () {
                zofka.penDown();
                zofka.turnLeft(90);
                zofka.move(30);
                zofka.turnRight(45);
                BarevneKolecko(1.25, Color.darkGray);

                for (int i = 0; i < 5; i++) {
                     zofka.penUp();
                     zofka.turnRight(30);
                     zofka.move(50);
                     zofka.penDown();
                     BarevneKolecko(1.75, Color.darkGray);
                 }
                zofka.turnRight(90);
             }




    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
