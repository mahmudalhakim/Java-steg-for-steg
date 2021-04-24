//Rekommenderat filnamn: FaltOvn1.java 

class FaltOvn1 {
  public static void main(String[] arg) {
    double[] f1 = new double[4];
    for (int i=0; i<f1.length; i++)
      f1[i] = 0;

    // eller enklare:
    // double[] f1 = {0, 0, 0, 0};

    int[] f2 = {5, 10, 20, 50, 100, 200, 500};
    for (double x : f1)
      System.out.println(x);
    for (int j : f2)
      System.out.println(j);
  }      
}
