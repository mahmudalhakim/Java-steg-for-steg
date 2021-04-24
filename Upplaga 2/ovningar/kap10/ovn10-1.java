// Rekommenderat filnamn: TabellOvn.java
import java.io.*;
class TabellOvn {
  public static void main (String[] arg) throws IOException {
    var input = new BufferedReader
               (new InputStreamReader(System.in));
    System.out.print("n1? ");
    String s = input.readLine();
    int n1 = Integer.parseInt(s);
    System.out.print("n2? ");
    s = input.readLine();
    int n2 = Integer.parseInt(s);
    // Skriv rubriker
    System.out.println("n\tn!");
    System.out.println(); 
    // Skriv tabellraderna
    for (int i=n1; i<=n2; i++)
      System.out.println(i + "\t" + nfak(i));
  }

  static double nfak(int n) {
    double r=1;
    for (int i=2; i <=n; i++)
      r = r*i;
    return r;
  }
}
