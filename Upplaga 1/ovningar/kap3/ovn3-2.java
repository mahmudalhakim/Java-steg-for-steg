// Filen Tilldelning2.java

import javax.swing.*; 

public class Tilldelning2 {
  public static void main (String[] arg) {
    int i;
    double d;
    byte b;
    i = 500.7;  // inte tillåten eftersom decimaler inte kan lagras i en int
    d = 500.7;  // OK!
    b = 500.7;  // inte tillåten eftersom 500.7 inte ryms i en variabel av typen byte
  }
} 
