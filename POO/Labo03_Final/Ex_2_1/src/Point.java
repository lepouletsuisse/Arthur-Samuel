/*
 -----------------------------------------------------------------------------------
 Laboratoire : 03
 Fichier     : Point.java
 Auteur(s)   : Samuel Darcey & Arthur Verdone
 Date        : 13.10.2015

 But         : Classe permettant de gerer des points ayant des
               coordonnées cartésienne

 Remarque(s) : Exercice 2, partie 1

 Compilateur : jdk1.8.0_60
 -----------------------------------------------------------------------------------
*/
public class Point {
   /**
    * Constructeur du point, initialise les coordonnées
    * carthésienne
    */
   public Point(double x, double y) {
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
      tmpX = (rho() * Math.cos(theta() + angle));
      tmpY = (rho() * Math.sin(theta() + angle));

      this.x = tmpX;
      this.y = tmpY;
   }

   /**
    * retourne le radius (rho) des coordonnee polaire
    */
   public double rho() {
      return convertirEnRho(x, y);
   }

   /**
    * retourne la coordonnée polaire theta
    */
   public double theta() {
      return convertirEnTheta(x, y);
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

   /**
    * donne le rho d'un point carthesien
    */
   private double convertirEnRho(double x, double y) {
      //calcul du radius (pythagore)
      return Math.sqrt(x * x + y * y);
   }

   /**
    * donne le theta d'un point carthesien
    */
   private double convertirEnTheta(double x, double y) {
      /**
       * source : https://www.wikiwand.com/fr/Coordonn%C3%A9es_polaires#/
       * Placer_des_points_en_coordonn.C3.A9es_polaires
       */
      return Math.atan2(y, x);
   }

   /**
    * donne le X a partir d'une coordonnée polaire
    */
   private double convertirPolEnCarthX(double rho, double theta) {
      return (int) (rho * Math.cos(theta));
   }

   /**
    * donne le Y a partir d'une coordonnée polaire
    */
   private double convertirPolEnCarthY(double rho, double theta) {
      return (int) (rho * Math.sin(theta));
   }

}
