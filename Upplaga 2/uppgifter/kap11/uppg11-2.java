// Rekommenderat filnamn: Temperaturer2.java

import java.util.*;    // inneh�ller klassen Scanner
import java.io.*;      // Inneh�ller klassen File

class Temperaturer2 {
  public static void main(String[] arg) throws IOException {
    BufferedReader input = new BufferedReader
                          (new InputStreamReader(System.in)); 
    System.out.print("Filnamn? "); 
    String namn= input.readLine();
	 var sc = new Scanner(new File(namn));
    int n = 0;            // antal temperatuer
    double sum = 0;       // summan av temperaturerna
    double[] temp = new double[100];

    while (sc.hasNextDouble()) {     // finns det fler temperatuer?
      temp[n] = sc.nextDouble();     // ja, l�s n�sta temperatur
      sum += temp[n];
      n++;
    }
    double mv = sum / n;
    System.out.println("H�gre �n medelv�rdet:");
    for (int i=0; i<n; i++)
      if (temp[i] > mv)
        System.out.println("rad " + i + ": " + temp[i]);
  }      
}
