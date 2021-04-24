//Filen FaltOvn3.java 

public class FaltOvn3 {
  public static void main(String[] arg) {
    double[] a = new double[10];
    for (int i=0; i<a.length; i++)
      a[i] = 1.0/(a.length-i);     // Obs! 1/(a.length-i)) hade givit heltalsdivision

    for (double d : a)
      System.out.println(d);
  }      
}
