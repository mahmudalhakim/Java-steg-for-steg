// Filen Bensin.java

import java.io.*;

class Bensin { 

  public static void main(String[] arg) throws IOException { 
    BufferedReader input = new BufferedReader
                          (new InputStreamReader(System.in)); 
    System.out.print("Dagens mätarställning? "); System.out.flush();
    String s = input.readLine();
    int m1 = Integer.parseInt(s);
    System.out.print("Mätarställning för ett år sedan? "); System.out.flush();
    s = input.readLine();
    int m2 = Integer.parseInt(s);
    System.out.print("Antal liter förbrukad bensin? "); System.out.flush();
    s = input.readLine();
    double li = Double.parseDouble(s);
    System.out.println("Antal körda mil:\t" + (m1-m2));
    System.out.println("Antal liter bensin:\t" + li);
    System.out.println("Förbrukning per mil:\t" + li/(m1-m2)); 
  }
}


