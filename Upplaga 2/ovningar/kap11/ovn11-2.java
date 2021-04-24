//Rekommenderat filnamn: FaltOvn2.java 

class FaltOvn2 {
  public static void main(String[] arg) {
    double[] a = new double[10];
    for (int i=0; i<a.length; i++)
      a[i] = 1.0/(i+1);     // Obs! 1/(i+1) hade gett heltalsdivision

    for (double d : a)
      System.out.println(d);
  }      
}
