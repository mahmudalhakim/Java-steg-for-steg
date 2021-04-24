//Filen FaltKopiering.java

public class FaltKopiering {
  public static void main(String[] arg) {
    int[] a = new int[100];
    for (int i=0; i<a.length; i++)
      a[i] = i;
    int[] b = new int[20];

    int i, j;
    for (i=50, j=10; i<55; i++, j++)
      b[j] = a[i];
    System.arraycopy(a, 95, b, 5, 5);

    for (int k : b)
      System.out.println(k); 
  }      
}
