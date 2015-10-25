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
public class PointEx2Part2 {
   /**
    * Constructeur du point, initialise les coordonnées
    * Polaire avec des paramètres d'entrées carthésiens
    */
   public PointEx2Part2(double x, double y) {
      this.x = convertToRho(x, y);
      this.y = convertToTheta(x, y);
   }

   /**
    * deplace le point selon les valeurs entrée en argument
    */
   public void déplace(double dx, double dy) {
      double cartX = convertPolToCarthX(x, y) + dx;
      double cartY = convertPolToCarthY(x, y) + dy;

      x = convertToRho(cartX,cartY);
      y = convertToTheta(cartX,cartY);
   }

   /**
    * Retourne l'abscisse (x)
    */
   public double abscisse() {
      return convertPolToCarthX(x,y);
   }

   /**
    * Retourne l'ordonnée (Y)
    */
   public double ordonnée() {
      return convertPolToCarthY(x,y);
   }

   /**
    * effectue une homothétie avec la valeur
    * fournie en argument
    */
   public void homothétie(double mult) {
      double cartX = convertPolToCarthX(x, y) * mult;
      double cartY = convertPolToCarthY(x, y) * mult;

      this.x = convertToRho(cartX, cartY);
      this.y = convertToTheta(cartX,cartY);
   }

   /**
    * effectue une rotation avec l'angle (en radiant)
    * fournie en argument
    */
   public void rotation(double angle) {
      double tmpX, tmpY;
      tmpX = rho() * Math.cos(theta() - angle);
      tmpY = rho() * Math.sin(theta() - angle);

      this.x = convertToRho(tmpX,tmpY);
      this.y = convertToTheta(tmpX,tmpY);
   }

   /**
    * retourne le radius (rho) des coordonnee polaire
    */
   public double rho() {
      return this.x;
   }

   /**
    * retourne la coordonnée polaire theta
    */
   public double theta() {
      return this.y;
   }

   /**
    * retourne une string contenant l'affichage des
    * coordonnées carthésiennes
    */
   public String afficheCartésien() {
      String strCarthésien = "Coordonnées carthésiennes (X,Y) : ";
      strCarthésien += "(" + abscisse() + "," + ordonnée() + ")";

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

   /**
    * donne le rho d'un point carthesien
    */
   private double convertToRho(double x, double y) {
      //calcul du radius (pythagore)
      return Math.sqrt(x * x + y * y);
   }

   /**
    * donne le theta d'un point carthesien
    */
   private double convertToTheta(double x, double y) {
      // source :
      // https://www.wikiwand.com/fr/
      // Coordonn%C3%A9es_polaires#/
      // Placer_des_points_en_coordonn.C3.A9es_polaires
      return Math.atan2(x,y);
   }

   /**
    * donne le X a partir d'une coordonnée polaire
    */
   private double convertPolToCarthX(double rho, double theta) {
      return rho * Math.cos(theta);
   }

   /**
    * donne le Y a partir d'une coordonnée polaire
    */
   private double convertPolToCarthY(double rho, double theta) {
      return rho * Math.sin(theta);
   }

}
