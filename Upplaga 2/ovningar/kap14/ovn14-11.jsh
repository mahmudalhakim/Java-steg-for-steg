class Kon implements Comparable<Kon> {
  double h;
  double r;

  double volym() {
    return Math.PI * r * r * h / 3;
  }

  public int compareTo(Kon annan) {
    if (volym() < annan.volym())
      return -1;
    else if (volym() > annan.volym())
      return 1;  
    else
      return 0;
  }
}

class jfrKon implements Comparator<Kon> {
  public int compare(Kon k1, Kon k2) {
    if (k1.h < k2.h)
      return -1;
    else if (k1.h > k2.h)
      return 1;
    else
      return 0;
  }
}