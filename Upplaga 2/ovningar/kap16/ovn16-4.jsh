public class Kon implements Comparable<Kon> {
  private double h;
  private double r;
  
  public void sättHöjd(double hh) {
    if (hh >= 0)
      h = hh;
    else
      throw new IllegalArgumentException("Felaktig höjd");
  }
  
  public double avläsHöjd() {
    return h;
  }
  
   public void sättRadie(double rr) {
    if (rr >= 0)
      r = rr;
    else
      throw new IllegalArgumentException("Felaktig radie");
  }
  
  public double avläsRadie() {
    return r;
  } 

  public double volym() {
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