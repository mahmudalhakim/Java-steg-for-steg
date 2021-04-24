//Filen KolOvn.java 

public class KolOvn {

  public static void main(String[] arg) {
    double[][] d2 = new double[3][5];
    d2[0][1] = 5; d2[1][1] = 6; d2[2][1] = 7;
    double[] f1 = väljKol(d2, 1);

    for (int i=0; i<f1.length; i++) 
      System.out.print(f1[i] + "\t");
    System.out.println();
  }      

  public static double[] väljKol(double[][] f, int k) {
    double[] kol = new double[f.length];
    for (int i=0; i<f.length; i++)
      kol[i] = f[i][k];
    return kol;
  } 
}
