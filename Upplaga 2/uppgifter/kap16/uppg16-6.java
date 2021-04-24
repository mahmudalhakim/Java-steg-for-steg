// Rekommenderat filnamn: C.java

class C {

  private static int totAntal = 0;
  private int id;

  C() {
    totAntal++;
    id = totAntal;
  }

  static int getAntal() {
    return totAntal;
  }

  int getId() {
    return id;
  } 
}


