import java.awt.geom.AffineTransform;

/**
 * -----------------------------------------------------------------------------------
 * Laboratoire : Labo03
 * Fichier     : PointEx2.java
 * Auteur(s)   : Arthur Verdon & Samuel Darcey
 * Date        : 16.10.2015
 * But         :
 * Remarque(s) :
 * Compilateur : jdk1.8.0_60
 * -----------------------------------------------------------------------------------
 */
public class PointEx2 {
   /**
    * Constructeur du point, initialise les coordonnées
    * carthésienne
    */
   public PointEx2(double x, double y) {
      this.x = x;
      this.y = y;
   }

   /**
    * deplace le point selon les valeurs entrée en argument
    */
   public void déplace(double dx, double dy) {
      x += dx;
      y += dy;
   }

   /**
    * Retourne l'abscisse (x)
    */
   public double abscisse() {
      return x;
   }

   /**
    * Retourne l'ordonnée (Y)
    */
   public double ordonnée() {
      return y;
   }

   /**
    * effectue une homothétie avec la valeur
    * fournie en argument
    */
   public void homothétie(double mult) {
      this.x *= mult;
      this.y *= mult;
   }

   /**
    * effectue une rotation avec l'angle (en radiant)
    * fournie en argument
    */
   public void rotation(double angle) {
      double tmpX, tmpY;
      tmpX = rho() * Math.cos(theta() - angle);
      tmpY = rho() * Math.sin(theta() - angle);

      this.x = tmpX;
      this.y = tmpY;
   }

   /**
    * retourne le radius (rho) des coordonnee polaire
    */
   public double rho() {
      //calcul du radius (pythagore)
      double radius = Math.pow(x * x + y * y, 1 / 2);

      return radius;
   }

   /**
    * retourne la coordonnée polaire theta
    */
   public double theta() {
      double angleTheta;

      // source :
      // https://www.wikiwand.com/fr/
      // Coordonn%C3%A9es_polaires#/
      // Placer_des_points_en_coordonn.C3.A9es_polaires
      angleTheta = 2 * Math.atan(y / (x + rho()));

      return angleTheta;
   }

   /**
    * retourne une string contenant l'affichage des
    * coordonnées carthésiennes
    */
   public String afficheCartésien() {
      String strCarthésien = "Coordonnées carthésiennes (X,Y) : ";
      strCarthésien += "(" + x + "," + y + ")";

      return strCarthésien;
   }

   /**
    * retourne une string contenant l'afficahge des
    * coordonnees polaire
    */
   public String affichePolaire() {
      String strPolaire = "Coordonnées Polaire (RHO,THETA) : ";
      strPolaire += "(" + rho() + "," + theta() + ")";

      return strPolaire;
   }

   private double x; // abscisse du point
   private double y; // ordonnée du point

}
