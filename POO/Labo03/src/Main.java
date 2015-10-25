/*
 -----------------------------------------------------------------------------------
 Laboratoire : 03
 Fichier     : Main.java
 Auteur(s)   : Samuel Darcey & Arthur Verdone
 Date        : 13.10.2015

 But         : Crée une classe Segment comportant 2 points et permettant différentes
               opérations sur cette objet (Permutation, modification, échanger avec
               un autre point...)

 Remarque(s) : <à compléter>

 Compilateur : jdk1.8.0_60
 -----------------------------------------------------------------------------------
*/

public class Main {
   public static void main(String args[]) {
      //EX1 main
      System.out.println("Exercice 1");
      System.out.println("==========");
      Segment s1 = new Segment(new Point(0, 0), new Point(5, 5));
      Segment s2 = new Segment(new Point(1, 1), new Point(6, 6));
      Point p1 = new Point(1, 1);
      Point p2 = new Point(2, 1);
      System.out.println("s1: " + s1.toString());
      System.out.println("s2: " + s2.toString());
      s1.échanger(s2);
      System.out.println("s1: " + s1.toString());
      System.out.println("s2: " + s2.toString());
      Segment.échanger(s1, s2);
      System.out.println("s1: " + s1.toString());
      System.out.println("s2: " + s2.toString());
      System.out.println(p1.toString() + " appartient à s1? " + s1.appartient(p1));
      System.out.println(p2.toString() + " appartient à s1? " + s1.appartient(p2));
      System.out.println("Permuter s1");
      s1.permuter();
      System.out.println(s1.toString());

      //EX2
      System.out.println("\n\nExercice 2");
      System.out.println("==========");
      PointEx2 pntA = new PointEx2(1,1);
      System.out.println(pntA.afficheCartésien());
      System.out.println(pntA.affichePolaire());
      pntA.déplace(-1, -1);
      System.out.println(pntA.afficheCartésien());
      System.out.println(pntA.affichePolaire());

      System.out.println();

      PointEx2 pntB = new PointEx2(1,1);
      System.out.println(pntB.afficheCartésien());
      System.out.println(pntB.affichePolaire());
      pntB.homothétie(2);
      System.out.println(pntB.afficheCartésien());
      System.out.println(pntB.affichePolaire());

      System.out.println();

      PointEx2 pntC = new PointEx2(1,0);
      System.out.println(pntC.afficheCartésien());
      System.out.println(pntC.affichePolaire());
      for(int i=0;i<8;i++)
         pntC.rotation(Math.toRadians(45));
      System.out.println(pntC.afficheCartésien());
      System.out.println(pntC.affichePolaire());

      //EX2 Part 2
      System.out.println("\n\nExercice 2 part 2");
      System.out.println("==========");
      PointEx2Part2 pntAPar2 = new PointEx2Part2(1,1);
      System.out.println(pntAPar2.afficheCartésien());
      System.out.println(pntAPar2.affichePolaire());
      pntAPar2.déplace(-1, -1);
      System.out.println(pntAPar2.afficheCartésien());
      System.out.println(pntAPar2.affichePolaire());

      System.out.println();

      PointEx2Part2 pntBPar2 = new PointEx2Part2(1,1);
      System.out.println(pntBPar2.afficheCartésien());
      System.out.println(pntBPar2.affichePolaire());
      pntBPar2.homothétie(2);
      System.out.println(pntBPar2.afficheCartésien());
      System.out.println(pntBPar2.affichePolaire());

      System.out.println();

      PointEx2Part2 pntCPar2 = new PointEx2Part2(1,0);
      System.out.println(pntCPar2.afficheCartésien());
      System.out.println(pntCPar2.affichePolaire());
      for(int i=0;i<8;i++)
         pntCPar2.rotation(Math.toRadians(45));
      System.out.println(pntCPar2.afficheCartésien());
      System.out.println(pntCPar2.affichePolaire());
   }
}
