/*
 -----------------------------------------------------------------------------------
 Laboratoire : 03
 Fichier     : Point.java
 Auteur(s)   : Samuel Darcey & Arthur Verdone
 Date        : 13.10.2015

 But         : Classe permettant de gerer des points ayant des
               coordonnées polaire

 Remarque(s) : Exercice 2, partie 2

 Compilateur : jdk1.8.0_60
 -----------------------------------------------------------------------------------
*/
public class Point {
   /**
    * Constructeur du point, initialise les coordonnées
    * Polaire avec des paramètres d'entrées carthésiens
    */
   public Point(double x, double y) {
      this.x = convertirEnRho(x, y);
      this.y = convertirEnTheta(x, y);
   }

   /**
    * deplace le point selon les valeurs entrée en argument
    */
   public void déplace(double dx, double dy) {
      double cartX = convertirPolEnCarthX(x, y) + dx;
      double cartY = convertirPolEnCarthY(x, y) + dy;

      x = convertirEnRho(cartX, cartY);
      y = convertirEnTheta(cartX, cartY);
   }

   /**
    * Retourne l'abscisse (x)
    */
   public double abscisse() {
      return convertirPolEnCarthX(x, y);
   }

   /**
    * Retourne l'ordonnée (Y)
    */
   public double ordonnée() {
      return convertirPolEnCarthY(x, y);
   }

   /**
    * effectue une homothétie avec la valeur
    * fournie en argument
    */
   public void homothétie(double mult) {
      double cartX = convertirPolEnCarthX(x, y) * mult;
      double cartY = convertirPolEnCarthY(x, y) * mult;

      this.x = convertirEnRho(cartX, cartY);
      this.y = convertirEnTheta(cartX, cartY);
   }

   /**
    * effectue une rotation avec l'angle (en radiant)
    * fournie en argument
    */
   public void rotation(double angle) {
      double tmpX, tmpY;
      tmpX = (rho() * Math.cos(theta() + angle));
      tmpY = (rho() * Math.sin(theta() + angle));

      this.x = convertirEnRho(tmpX, tmpY);
      this.y = convertirEnTheta(tmpX, tmpY);
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
   private double convertirEnRho(double x, double y) {
      /**
       * calcul du radius (pythagore)
       * */
      return Math.sqrt(x * x + y * y);
   }

   /**
    * donne le theta d'un point carthesien
    */
   private double convertirEnTheta(double x, double y) {
      /**
       * source : https://www.wikiwand.com/fr/Coordonn%C3%A9es_polaires#/
       * Placer_des_points_en_coordonn.C3.A9es_polaires
       * */
      return Math.atan2(y, x);
   }

   /**
    * donne le X a partir d'une coordonnée polaire
    */
   private double convertirPolEnCarthX(double rho, double theta) {
      return Math.round(rho * Math.cos(theta) * 100) / 100;
   }

   /**
    * donne le Y a partir d'une coordonnée polaire
    */
   private double convertirPolEnCarthY(double rho, double theta) {
      return Math.round(rho * Math.sin(theta) * 100) / 100;
   }

}
