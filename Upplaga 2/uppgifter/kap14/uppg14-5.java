// Rekommenderat filnamn: Datum.java

class Datum {
  int år;
  int mån;
  int dag;

  @Override
  public String toString() {
    return String.format("%4d-%02d-%02d", år, mån, dag);
  }

  boolean ärSkottår() {
    return (år % 4 == 0 && år % 100 != 0) || år % 400 == 0;
  }
}

