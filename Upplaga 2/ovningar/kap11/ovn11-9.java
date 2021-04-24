//Rekommenderat filnamn: FyllOvn.java

class FyllOvn {

  // Metoden fyll 
  static void fyll(double[] a, int i1, int i2, double x) {
    for (int i=i1; i<i2; i++)
      a[i] = x;
  }

  // Metoden skrivUt
  static void skrivUt(double[] a) {
    for (double d : a) // förenklat skrivsätt
      System.out.println(d);
  }  

  public static void main(String[] arg) {
    double[] f = new double[10];
    fyll(f, 5, 9, 2.3);
    skrivUt(f);
  }      
}
