/*
 -----------------------------------------------------------------------------------
 Laboratoire : 03
 Fichier     : Ex_1/Main.java
 Auteur(s)   : Samuel Darcey & Arthur Verdone
 Date        : 13.10.2015

 But         : Crée une classe Segment ayant 2 Point à ses extrémités et pourvoir y
               appliquer plusieurs type de méthode (Affichage, modification, échange,
               permutation, appartenance d'un point à un segment)

 Remarque(s) :

 Compilateur : jdk1.8.0_60
 -----------------------------------------------------------------------------------
*/

public class Main {
   public static void main(String args[]) {

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

   }
}
