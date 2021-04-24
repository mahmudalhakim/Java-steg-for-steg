// Rekommenderat filnamn: Vaxel.java 

import java.io.*; 

class Vaxel {

  public static void main(String[] arg) throws IOException {
    BufferedReader input = new BufferedReader
                          (new InputStreamReader(System.in)); 
    System.out.print("Pris? "); 
    String s = input.readLine();
    int pris = Integer.parseInt(s);
    System.out.print("Betalt? "); 
    s = input.readLine();
    int betalt = Integer.parseInt(s);
    int tillbaka = betalt - pris;
    System.out.println("Växel tillbaka: ");
    System.out.println(tillbaka/100 + " hundralappar");
    tillbaka = tillbaka % 100;
    System.out.println(tillbaka/50 + " femtiolappar");
    tillbaka = tillbaka % 50;
    System.out.println(tillbaka/20 + " tjugor");
    tillbaka = tillbaka % 20;
    System.out.println(tillbaka/10 + " tior");
    tillbaka = tillbaka % 10;
    System.out.println(tillbaka/5 + " femmor");
    tillbaka = tillbaka % 5;
    System.out.println(tillbaka + " enkronor");
  }
}


