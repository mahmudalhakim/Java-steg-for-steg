// Filen VisaKort.java

import java.util.*;
import java.io.*;
import javax.swing.*;

public class VisaKort {
   public static void main(String[] arg) throws IOException {
     Kort[] a = new Kort[52];
	 int antal = 0;
     String filnamn = JOptionPane.showInputDialog("Filens namn?");
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
       s += a[i].toString() + '\n';
     JOptionPane.showMessageDialog(null, s);         
   }
 }