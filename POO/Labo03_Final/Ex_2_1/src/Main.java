/*
 -----------------------------------------------------------------------------------
 Laboratoire : 03
 Fichier     : Main.java
 Auteur(s)   : Samuel Darcey & Arthur Verdone
 Date        : 13.10.2015

 But         : Crée une classe Point ayant des coordonnée cartésienne et pouvoir y
               appliqué plusieurs type de méthode (Déplacement, affichage,
               rotation, homothétie)

 Remarque(s) : Exercice 2, partie 1

 Compilateur : jdk1.8.0_60
 -----------------------------------------------------------------------------------
*/

public class Main {
   public static void main(String args[]) {

      System.out.println("Exercice 2, partie 1");
      System.out.println("====================");
      Point pntA = new Point(1, 1);
      System.out.println(pntA.afficheCartésien());
      System.out.println(pntA.affichePolaire());
      System.out.println("Déplacement du point de -1, -1...");
      pntA.déplace(-1, -1);
      System.out.println(pntA.afficheCartésien());
      System.out.println(pntA.affichePolaire());

      System.out.println();

      Point pntB = new Point(1, 1);
      System.out.println(pntB.afficheCartésien());
      System.out.println(pntB.affichePolaire());
      System.out.println("Homothétie...");
      pntB.homothétie(2);
      System.out.println(pntB.afficheCartésien());
      System.out.println(pntB.affichePolaire());

      System.out.println();

      Point pntC = new Point(1, 0);
      System.out.println(pntC.afficheCartésien());
      System.out.println(pntC.affichePolaire());
      System.out.println("Rotation de 45 degrès 8 fois (360 degrès)...");
      for (int i = 0; i < 8; i++) {
         pntC.rotation(Math.toRadians(45));
      }
      System.out.println(pntC.afficheCartésien());
      System.out.println(pntC.affichePolaire());
   }
}
