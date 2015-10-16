/*
 -----------------------------------------------------------------------------------
 Laboratoire : 03
 Fichier     : Point.java
 Auteur(s)   : Samuel Darcey & Arthur Verdone
 Date        : 13.10.2015

 But         : Cr�e une classe Segment comportant 2 points et permettant diff�rentes
               op�rations sur cette objet (Permutation, modification, �changer avec
               un autre point...)

 Remarque(s) :

 Compilateur : jdk1.8.0_60
 -----------------------------------------------------------------------------------
*/

public class Point {

   //Variables de la classe
   private double x;
   private double y;

   //Constructeur
   public Point(double x, double y){
      this.x = x;
      this.y = y;
   }

   //Red�finition de la m�thode toString. Retourne une String de la forme "(x,y)"
   public String toString(){
      String chaine = "(" + x + "," + y + ")";
      return chaine;
   }

   //M�thodes get

   public double getX(){
      return x;
   }

   public double getY(){
      return y;
   }
}
