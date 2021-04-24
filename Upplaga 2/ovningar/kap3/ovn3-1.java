// Rekommenderat filnamn: Tilldelning.java

class Tilldelning {
  public static void main (String[] arg) {
    int i;
    double d;
    byte b;
    i = 500;  // OK!
    d = 500;  // OK!
    b = 500;  // inte tillåten eftersom 500 inte ryms i en variabel av typen byte
  }
} 
