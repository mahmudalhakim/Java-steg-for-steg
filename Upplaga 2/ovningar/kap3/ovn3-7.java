// Rekommenderat filnamn: Tilldelning3.java

class Tilldelning3 {
  public static void main (String[] arg) {
    int i;
    double d;
    byte b;
    i = 500; 
    d = 500;  
    b = (byte) 500;    // v�rdet f�rvanskas
    System.out.println("i=" + i + " d=" + d + " b=" + b);
    i = (int) 500.7;   // i f�r v�rdet 500
    d = 500.7; 
    b = (byte) 500.7;  // v�rdet f�rvanskas
    System.out.println("i=" + i + " d=" + d + " b=" + b);
  }
}
