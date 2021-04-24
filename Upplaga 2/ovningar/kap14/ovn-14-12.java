// Rekommenderat filnamn: Datum.java

class Datum {
  int �r;
  int m�n;
  int dag;
  
  @Override
  public boolean equals(Object obj) {
    if (obj == null || obj.getClass() != getClass())
      return false;
    else {
      Datum d = (Datum) obj;
      return �r == d.�r && m�n == d.m�n && dag == d.dag;
    }
  }
  
  @Override
  public String toString() {
    return String.format("%4d-%02d-%02d", �r, m�n, dag);
  }
}