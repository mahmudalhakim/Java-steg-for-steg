// Filen FranRovare.java

import java.io.*;

class FranRovare {
   public static void main (String[] arg) throws IOException {

     BufferedReader input = new BufferedReader
                          (new InputStreamReader(System.in));

     String konsonant = "bcdfghjklmnpqrstvxz" +
                        "BCDFGHJKLMNPQRSTVXZ";
     while (true) {
       String s1 = input.readLine();
       if (s1 == null)
         break;
       String s2 = "";
       for (int i=0; i< s1.length(); i++) {
         char c = s1.charAt(i);
         s2 = s2 + c;
         if (konsonant.indexOf(c)>=0) 
           i = i + 2;
       }
       System.out.println(s2); 
     }
   }
 }

