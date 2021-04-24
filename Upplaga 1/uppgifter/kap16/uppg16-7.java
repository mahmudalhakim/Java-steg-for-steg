// Filen C.java

public class C {

  private static int totAntal = 0;
  private int id;

  public C() {
    totAntal++;
    id = totAntal;
  }

  public static int getAntal() {
    return totAntal;
  }

  public int getId() {
    return id;
  } 
}


