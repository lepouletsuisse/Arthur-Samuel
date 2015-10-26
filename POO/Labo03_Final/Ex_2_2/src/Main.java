/*
 -----------------------------------------------------------------------------------
 Laboratoire : 03
 Fichier     : Ex_2_2/Main.java
 Auteur(s)   : Samuel Darcey & Arthur Verdone
 Date        : 13.10.2015

 But         : Crée une classe Point ayant des coordonnée polaire et pouvoir y
               appliqué plusieurs type de méthode (Déplacement, affichage,
               rotation, homothétie)

 Remarque(s) :

 Compilateur : jdk1.8.0_60
 -----------------------------------------------------------------------------------
*/

public class Main {
   public static void main(String args[]) {

      System.out.println("Exercice 2, partie 2");
      System.out.println("====================");
      Point pntAPar2 = new Point(1, 1);
      System.out.println(pntAPar2.afficheCartésien());
      System.out.println(pntAPar2.affichePolaire());
      System.out.println("Déplacement du point de -1, -1...");
      pntAPar2.déplace(-1, -1);
      System.out.println(pntAPar2.afficheCartésien());
      System.out.println(pntAPar2.affichePolaire());

      System.out.println();

      Point pntBPar2 = new Point(1, 1);
      System.out.println(pntBPar2.afficheCartésien());
      System.out.println(pntBPar2.affichePolaire());
      System.out.println("Homothétie...");
      pntBPar2.homothétie(2);
      System.out.println(pntBPar2.afficheCartésien());
      System.out.println(pntBPar2.affichePolaire());

      System.out.println();

      Point pntCPar2 = new Point(1, 0);
      System.out.println(pntCPar2.afficheCartésien());
      System.out.println(pntCPar2.affichePolaire());
      System.out.println("Rotation de 45 degrès 8 fois (360 degrès)...");
      for (int i = 0; i < 8; i++) {
         pntCPar2.rotation(Math.toRadians(45));
      }
      System.out.println(pntCPar2.afficheCartésien());
      System.out.println(pntCPar2.affichePolaire());
   }
}
