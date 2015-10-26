/*
 -----------------------------------------------------------------------------------
 Laboratoire : 03
 Fichier     : Ex_1/Segment.java
 Auteur(s)   : Samuel Darcey & Arthur Verdone
 Date        : 13.10.2015

 But         : Crée une classe Segment comportant 2 points et permettant différentes
               opérations sur cet objet (Affichage, modification, échange,
               permutation, appartenance d'un point à un segment)

 Remarque(s) :

 Compilateur : jdk1.8.0_60
 -----------------------------------------------------------------------------------
*/

public class Segment {
   /**
    * Variables de la classe
    */
   private Point a;
   private Point b;

   /**
    * Constructeur à partir de 2 points
    */
   public Segment(Point a, Point b) {
      this.a = a;
      this.b = b;
   }

   /**
    * Constructeur à partir des coordonnées des 2 points
    */
   public Segment(double x1, double y1, double x2, double y2) {
      this.a = new Point(x1, y1);
      this.b = new Point(x2, y2);
   }

   /**
    * Méthodes get
    */
   public Point getA() {
      return a;
   }

   public Point getB() {
      return b;
   }

   /**
    * Méthodes set
    */
   public void setA(Point p) {
      a = p;
   }

   public void setB(Point p) {
      b = p;
   }

   /**
    * Redéfinition de toString. Retourne une chaine de la forme "[(x1,y1) ; (x2,y2)]"
    */
   public String toString() {
      String chaine = "[" + a.toString() + " ; " + b.toString() + "]";
      return chaine;
   }

   /**
    * Affiche le segment
    */
   public void afficher() {
      System.out.println(this.toString());
   }

   /**
    * Retourne la longueur du segment
    */
   public double longueur() {

      // Pythagore: deltaX^2 + deltaY^2 = longueurSegment^2
      double deltaX = a.getX() - b.getX();
      double deltaY = a.getY() - b.getY();
      return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
   }

   /**
    * Retourne un boolean indiquant si le point p appartient au segment
    */
   public boolean appartient(Point p) {
      /**
       * a,b sont les points du segment et p le point passé en paramètre
       * On fait le produit scalaire (ps) des vecteurs ab et ap puis on compare le
       * résultat avec le produit des norme des 2 même vecteurs. Si les valeurs sont
       * égales, alors les 2 vecteurs sont colinéaire. Nous contrôlons ensuite si
       * la coordonnée x du point p se trouve entre les coordonnées x des points
       * a et b, ce qui démontre que le point est effectivement sur le segment.
       * */

      /**
       * Calcul les coordonnée x et y des 2 vecteurs ab et ap
       * */
      double abX = b.getX() - a.getX();
      double abY = b.getY() - a.getY();
      double apX = p.getX() - a.getX();
      double apY = p.getY() - a.getY();

      /**
       * Calcul les normes des 2 vecteurs ainsi que leurs multiplications arrondie
       * à la 4ième décimal. La norme est similaire à la longueur d'un segment
       * */
      double normeAb = this.longueur();
      double normeAp = new Segment(a, p).longueur();
      double normeMultiplié = (int) ((normeAb * normeAp) * 10000) / 10000.0;

      /**
       * Produit scalaire de ab et ap =
       * ab * ap = ab.compX * ap.compX + ab.compY * ap.compY
       * */
      double produitScalaireAbAp = abX * apX + abY * apY;

      /**
       * Si ab * ap == ab.norme * ap.norme * cos(teta) où teta = 0
       * donc cos(teta) = 1, alors ils sont colinéaire
       * */
      if (produitScalaireAbAp == normeMultiplié) {
         /**
          * Si p.x est entre a.x et b.x alors il est dans le segment
          * */

         /**
          * Regarde quel point du segment à le x minimum
          * */
         Point minX = a;
         Point maxX = b;
         if (a.getX() > b.getX()) {
            minX = b;
            maxX = a;
         }

         /**
          * Controle si p.x se trouve entre a.x et b.x
          * */
         if (p.getX() >= minX.getX() && p.getX() <= maxX.getX()) {
            return true;
         }
      }
      return false;
   }

   /**
    * Permute les 2 points du segment
    */
   public void permuter() {
      Point tmp = a;
      a = b;
      b = tmp;
   }

   /**
    * Echange les points des 2 segments this et s. Ne modifie pas les référence des
    * segments. Méthode asymétrique
    */
   public void échanger(Segment s) {
      Point tmpA = a;
      Point tmpB = b;
      a = s.a;
      b = s.b;
      s.a = tmpA;
      s.b = tmpB;
   }

   /**
    * Echange les points des 2 segments s1 et s2. Ne modifie pas les référence des
    * segments. Méthode symétrique statique
    */
   public static void échanger(Segment s1, Segment s2) {
      Point tmpA = s1.a;
      Point tmpB = s1.b;
      s1.a = s2.a;
      s1.b = s2.b;
      s2.a = tmpA;
      s2.b = tmpB;
   }
}
