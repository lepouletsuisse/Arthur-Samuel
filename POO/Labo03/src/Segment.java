/*
 -----------------------------------------------------------------------------------
 Laboratoire : 03
 Fichier     : Segment.java
 Auteur(s)   : Samuel Darcey & Arthur Verdone
 Date        : 13.10.2015

 But         : Crée une classe Segment comportant 2 points et permettant différentes
               opérations sur cette objet (Permutation, modification, échanger avec
               un autre point...)

 Remarque(s) : <à compléter>

 Compilateur : jdk1.8.0_60
 -----------------------------------------------------------------------------------
*/

public class Segment {
   //Variables de la classe
   private Point a;
   private Point b;

   //Constructeur à partir de 2 points
   public Segment(Point a, Point b){
      this.a = a;
      this.b = b;
   }

   //Constructeur à partir des coordonnées des 2 points
   public Segment(double x1, double y1, double x2, double y2){
      Point a = new Point(x1, y1);
      Point b = new Point(x2, y2);
      this.a = a;
      this.b = b;
   }

   //Méthodes get
   public Point getA(){
      return a;
   }

   public Point getB(){
      return b;
   }

   //Méthodes set
   public void setA(Point p){
      a = p;
   }
   public void setB(Point p){
      b = p;
   }

   //Redéfinition de toString. Retourne une chaine de la forme "[(x1,y1) ; (x2,y2)]"
   public String toString(){
      String chaine = "[" + a.toString() + " ; " + b.toString() + "]";
      return chaine;
   }

   //Affiche le segment
   public void afficher(){
      System.out.println(this.toString());
   }

   //Retourne la longueur du segment
   public double longueur(){

      // Pythagore: deltaX^2 + deltaY^2 = longueur^2
      double deltaX = a.getX() - b.getX();
      double deltaY = a.getY() - b.getY();
      double longueur = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
      return longueur;
   }

   //Retourne un boolean indiquant si le point p appartient au segment
   public boolean appartient(Point p){
      /*
      * Calcul l'équation cartésienne de la droite mx + h = y où m = pente et
      * h = hauteur à l'origine. Si on obtient 0 quand on introduit notre point dans
      * notre équation, cela signifie que le point appartient à la droite.
      *
      double deltaX = Math.abs(a.getX() - b.getX());
      double deltaY = Math.abs(a.getY() - b.getY());
      double pente = deltaY / deltaX;
      double hauteurOrigine = a.getY() - pente * a.getX();
      double result = pente * p.getX() + hauteurOrigine - p.getY();
      if(result == 0){
         return true;
      }
      return false;
      */

      /*
      * a,b point du segment et p point
      * Produit scalaire de ab et ap puis compararer avec le produit des norme des 2
      * vecteurs. Si elles sont égal alors les 2 vecteurs sont colinéaire
      * */
      double norme_ab = this.longueur();
      double norme_ap = new Segment(a, p).longueur();
      double norme_mult = (int)((norme_ab * norme_ap) * 10000) / 10000.0;

      //Produit scalaire de ab et ap = ab * ap = ab.compX * ap.compX + ab.compY * ap.compY
      double ps_ab_ap =  (b.getX() - a.getX()) * (p.getX() - a.getX()) + (b.getY() - a.getY()) * (p.getY() - a.getY());

      //Si ab * ap == ab.norm * ap.norme * cos(teta) où teta = 0 donc cos(teta) = 1, alors ils sont colinéaire
      if(ps_ab_ap == norme_mult){
         //Si p.x est entre a.x et b.x alors il est dans le segment

         //Regarde quel point à la x minimum
         Point minX = a;
         Point maxX = b;
         if(a.getX() > b.getX()){
            minX = b;
            maxX = a;
         }

         if(p.getX() > minX.getX() && p.getX() < maxX.getX()){
            return true;
         }
      }
      return false;
   }

   //Permute
   public void permuter(){
      Point tmp = a;
      a = b;
      b = tmp;
   }
   public void échanger(Segment s){
      Point tmpA = a;
      Point tmpB = b;
      a = s.a;
      b = s.b;
      s.a = tmpA;
      s.b = tmpB;
   }
   public static void échanger(Segment s1, Segment s2){
      Point tmpA = s1.a;
      Point tmpB = s1.b;
      s1.a = s2.a;
      s1.b = s2.b;
      s2.a = tmpA;
      s2.b = tmpB;
   }
}
