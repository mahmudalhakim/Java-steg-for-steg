 // Rekommenderat filnamn: Pstrak.java

 import java.io.*; 

 class Psprak {
   public static void main (String[] arg) throws IOException {
     BufferedReader input = new BufferedReader
                           (new InputStreamReader(System.in));
     String vokaler = "aouåeiyäöAOUÅEIYÄÖ";
     while (true) {
       String s1 = input.readLine();
       if (s1 == null)
         break;
       String s2 = "";
       for (int i=0; i<s1.length(); i++) {
         char c = s1.charAt(i);
         s2 = s2 + c;
         if (vokaler.indexOf(c)>=0) 
           i = i + 2; // hoppa över två tecken
       }
       System.out.println(s2);
     }
   }
 }



