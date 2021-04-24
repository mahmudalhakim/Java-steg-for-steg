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