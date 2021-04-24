// Rekommenderat filnamn:  Uttryck2

class Uttryck2 {
  public static void main (String[] arg) {
    for (double x=-1; x<=1; x=x+0.1) {
      double f = 2*x*x - 5*x + 1;
      System.out.println(x + "   " + f);
    }      
  }
}
