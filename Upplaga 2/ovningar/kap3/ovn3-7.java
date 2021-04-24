// Rekommenderat filnamn: Tilldelning3.java

class Tilldelning3 {
  public static void main (String[] arg) {
    int i;
    double d;
    byte b;
    i = 500; 
    d = 500;  
    b = (byte) 500;    // värdet förvanskas
    System.out.println("i=" + i + " d=" + d + " b=" + b);
    i = (int) 500.7;   // i får värdet 500
    d = 500.7; 
    b = (byte) 500.7;  // värdet förvanskas
    System.out.println("i=" + i + " d=" + d + " b=" + b);
  }
}
