/*
 -----------------------------------------------------------------------------------
 Laboratoire : <nn>
 Fichier     : Main.java
 Auteur(s)   : Samuel Darcey
 Date        : 13.10.2015

 But         : <à compléter>

 Remarque(s) : <à compléter>

 Compilateur : jdk1.8.0_60
 -----------------------------------------------------------------------------------
*/

public class Main {
   public static void main(String [] args){
      // TEST CLASS POINTEX2
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

   }
}
