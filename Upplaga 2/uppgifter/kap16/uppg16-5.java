// Rekommenderat filnamn: C.java

class C {

  private static int totAntal = 0;

  C() {
    totAntal++;
  }

  static int getAntal() {
    return totAntal;
  }
}


