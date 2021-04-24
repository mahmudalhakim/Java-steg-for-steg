// Rekommenderat filnamn: Datum.java

class Datum implements Comparable<Datum> {
  int �r;
  int m�n;
  int dag;

  public String toString() {
    return String.format("%4d-%02d-%02d", �r, m�n, dag);
  }

  public int compareTo(Datum d) {
    if (�r == d.�r && m�n == d.m�n && dag == d.dag) 
      return 0;
    else if  (�r < d.�r || (�r == d.�r && m�n < d.m�n) || (�r == d.�r && m�n == d.m�n && dag < d.dag))
      return -1;
    else
      return 1;
  }

}

