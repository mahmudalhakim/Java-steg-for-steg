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
       System.out.print("Hoppets sv�righetsgrad? ");
       double sv�righet = scan.nextDouble(); 
       if (sv�righet <= 0)
         break;      
       double sum = 0;
       double minPo�ng=10;
       double maxPo�ng=0;
	    for (int i = 1; i <= n; i++)  {
         System.out.print("Po�ngen fr�n domare nr " + i + "? ");
         double domarPo�ng = scan.nextDouble(); 
         sum = sum + domarPo�ng;
         maxPo�ng = Math.max(maxPo�ng, domarPo�ng);
         minPo�ng = Math.min(minPo�ng, domarPo�ng); 
       }		 
       sum = sum - maxPo�ng - minPo�ng; 
       double hoppPo�ng = sum / (n-2) * 3 * sv�righet;
       System.out.println("Hoppets po�ng: " + hoppPo�ng);
     }
   }
 }

