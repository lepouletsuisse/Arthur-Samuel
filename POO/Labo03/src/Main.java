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
   }
}
