// Rekommenderat filnamn: Simhopp.java

 import java.util.*;
 
class Simhopp {
   public static void main (String[] arg) {
     var scan = new Scanner(System.in);
    System.out.print("Antal domare? ");
    int n = scan.nextInt(); 
	 if (n < 3) {
	   System.out.println("Felaktigt antal domare?");
	   System.exit(0);
	 }	   
     while(true) {
       System.out.print("Hoppets svårighetsgrad? ");
       double svårighet = scan.nextDouble(); 
       if (svårighet <= 0)
         break;      
       double sum = 0;
       double minPoäng=10;
       double maxPoäng=0;
	    for (int i = 1; i <= n; i++)  {
         System.out.print("Poängen från domare nr " + i + "? ");
         double domarPoäng = scan.nextDouble(); 
         sum = sum + domarPoäng;
         maxPoäng = Math.max(maxPoäng, domarPoäng);
         minPoäng = Math.min(minPoäng, domarPoäng); 
       }		 
       sum = sum - maxPoäng - minPoäng; 
       double hoppPoäng = sum / (n-2) * 3 * svårighet;
       System.out.println("Hoppets poäng: " + hoppPoäng);
     }
   }
 }

