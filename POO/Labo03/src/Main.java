/*
 -----------------------------------------------------------------------------------
 Laboratoire : 03
 Fichier     : Main.java
 Auteur(s)   : Samuel Darcey & Arthur Verdone
 Date        : 13.10.2015

 But         : A COMPLETER POUR CHAQUE MAIN

 Remarque(s) : <à compléter>

 Compilateur : jdk1.8.0_60
 -----------------------------------------------------------------------------------
*/

public class Main {
   public static void main(String args[]) {
      /*
      * Exercice 1
      * */
      System.out.println("Exercice 1");
      System.out.println("==========");

      Point p1 = new Point(2, 2);
      Point p2 = new Point(2.1, 2);
      Point p3 = new Point(5, 5);
      Point p4 = new Point(5.1, 5.1);

      System.out.println("Création du segment 1 à partir de 2 objet points...");
      Segment s1 = new Segment(new Point(4, 3), new Point(12, 9));
      System.out.println("Création du segment 2 à partir des coordonnées x et y de" +
              " 2 points...");
      Segment s2 = new Segment(1, 1, 6, 6);

      System.out.println("Segment 1: " + s1.toString());
      System.out.println("Segment 2: " + s2.toString());

      System.out.println("Affichage des points du segment 1 séparement...");
      System.out.println("Point a: " + s1.getA().toString() +
              " // Point b: " + s1.getB().toString());

      System.out.println("Modification des points du segment 1 en a = (0,0) " +
              "et b = (5,5)...");
      s1.setA(new Point(0, 0));
      s1.setB(new Point(5, 5));
      System.out.println("Segment 1: " + s1.toString());

      System.out.println("Affichage des points du segment 1 grâce à la méthode " +
              "afficher()...");
      s1.afficher();

      System.out.println("\nEtat actuel: ");
      System.out.println("Segment 1: " + s1.toString());
      System.out.println("Segment 2: " + s2.toString());

      System.out.println("Echange les points des 2 segments (non-static)...");
      s1.échanger(s2);
      System.out.println("Segment 1: " + s1.toString());
      System.out.println("Segment 2: " + s2.toString());

      System.out.println("Echange les points des 2 segments (static)...");
      Segment.échanger(s1, s2);
      System.out.println("Segment 1: " + s1.toString());
      System.out.println("Segment 2: " + s2.toString());

      System.out.println("Le point " + p1.toString() + " appartient-il au segment 1?"
              + (s1.appartient(p1) ? " Oui" : " Non"));
      System.out.println("Le point " + p2.toString() + " appartient-il au segment 1?"
              + (s1.appartient(p2) ? " Oui" : " Non"));
      System.out.println("Le point " + p3.toString() + " appartient-il au segment 1?"
              + (s1.appartient(p3) ? " Oui" : " Non"));
      System.out.println("Le point " + p4.toString() + " appartient-il au segment 1?"
              + (s1.appartient(p4) ? " Oui" : " Non"));

      System.out.println("Permutation des points du segment 1");
      s1.permuter();
      System.out.println("Segment 1: " + s1.toString());

      /*
      * Exercice 2
      * */
      System.out.println("\n\nExercice 2");
      System.out.println("==========");
      PointEx2 pntA = new PointEx2(1, 1);
      System.out.println(pntA.afficheCartésien());
      System.out.println(pntA.affichePolaire());
      System.out.println("Déplacement du point de -1, -1...");
      pntA.déplace(-1, -1);
      System.out.println(pntA.afficheCartésien());
      System.out.println(pntA.affichePolaire());

      System.out.println();

      PointEx2 pntB = new PointEx2(1, 1);
      System.out.println(pntB.afficheCartésien());
      System.out.println(pntB.affichePolaire());
      System.out.println("Homothétie...");
      pntB.homothétie(2);
      System.out.println(pntB.afficheCartésien());
      System.out.println(pntB.affichePolaire());

      System.out.println();

      PointEx2 pntC = new PointEx2(1, 0);
      System.out.println(pntC.afficheCartésien());
      System.out.println(pntC.affichePolaire());
      System.out.println("Rotation de 45 degrès 8 fois (360 degrès)...");
      for (int i = 0; i < 8; i++) {
         pntC.rotation(Math.toRadians(45));
      }
      System.out.println(pntC.afficheCartésien());
      System.out.println(pntC.affichePolaire());

      //EX2 Part 2
      System.out.println("\n\nExercice 2 part 2");
      System.out.println("==========");
      PointEx2Part2 pntAPar2 = new PointEx2Part2(1, 1);
      System.out.println(pntAPar2.afficheCartésien());
      System.out.println(pntAPar2.affichePolaire());
      System.out.println("Déplacement du point de -1, -1...");
      pntAPar2.déplace(-1, -1);
      System.out.println(pntAPar2.afficheCartésien());
      System.out.println(pntAPar2.affichePolaire());

      System.out.println();

      PointEx2Part2 pntBPar2 = new PointEx2Part2(1, 1);
      System.out.println(pntBPar2.afficheCartésien());
      System.out.println(pntBPar2.affichePolaire());
      System.out.println("Homothétie...");
      pntBPar2.homothétie(2);
      System.out.println(pntBPar2.afficheCartésien());
      System.out.println(pntBPar2.affichePolaire());

      System.out.println();

      PointEx2Part2 pntCPar2 = new PointEx2Part2(1, 0);
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
