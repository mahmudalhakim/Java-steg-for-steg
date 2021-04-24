// Rekommenderat filnamn:  Uttryck1

class Uttryck1 {
  public static void main (String[] arg) {
    String tabell = "";
    for (int x=-10; x<=10; x=x+1) {
      int f = 2*x*x - 5*x + 1;
      System.out.println(x + "   " + f);
    }      
  }
}
