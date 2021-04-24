// Rekommenderat filnamn: VisaKort.java

import java.util.*;
import java.io.*;

class VisaKort {
   public static void main(String[] arg) throws IOException {
     Kort[] a = new Kort[52];
	  int antal = 0;
     var tangentbord = new Scanner(System.in);
     System.out.print("Filens namn? ");
     String filnamn = tangentbord.nextLine();
	  Scanner sc = new Scanner(new File(filnamn));
	  while (sc.hasNextInt()) {
	    int f = sc.nextInt(), v = sc.nextInt();
	    a[antal] = new Kort();
	    a[antal].färg  = f;
	    a[antal].valör = v;
	    antal++;
	  }
	  Arrays.sort(a, 0, antal);
     String s = "";
     for (int i =0; i<antal; i++)
       System.out.println(a[i]);        
   }
 }