// Rekommenderat filnamn: Datum.java

class Datum {
  int �r;
  int m�n;
  int dag;
  
  @Override
  public String toString() {
    return String.format("%4d-%02d-%02d", �r, m�n, dag);
  }
}

