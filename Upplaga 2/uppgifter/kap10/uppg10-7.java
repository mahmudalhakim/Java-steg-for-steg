// Rekommenderat filnamn: FranRovare.java

 import java.util.*;
 import java.io.*;

 class FranRovare {
   public static void main (String[] arg) throws IOException {
     var tangentbord = new Scanner(System.in);
     System.out.print("Vad heter infilen? "); 
     String namn = tangentbord.nextLine();
     Scanner fil = new Scanner(new FileReader(namn));
     String konsonanter = "bcdfghjklmnpqrstvxz" +
                          "BCDFGHJKLMNPQRSTVXZ";
     System.out.println("Det hemliga meddelandet är:");

     while (fil.hasNextLine()) {
       String rad = fil.nextLine();
       int i = 0;
       while (i < rad.length()) {
         char c = rad.charAt(i);
         System.out.print(c);
         if (konsonanter.indexOf(c)>=0) {
           char c1 = ' ', c2 = ' ';
           if (rad.length() > i+2) {
             c1 = Character.toLowerCase(rad.charAt(i+1));
             c2 = Character.toLowerCase(rad.charAt(i+2));
             i += 2;
           }
           if (c1 != 'o' || c2 != Character.toLowerCase(c)) {
             System.out.println("\nFilen innehåller inte korrekt rövarspråk");
             System.exit(0);
           }
         }
         i++;        
       }
       System.out.println();
     }
   }
 }
