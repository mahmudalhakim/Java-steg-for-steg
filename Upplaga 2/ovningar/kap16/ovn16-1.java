// Filen Klockslag.java

public class Klockslag {
  private int tim;
  private int min;

  public void s�ttTim(int t)  {
    if (t >= 0 && t <=23)
      tim = t;
    else
      throw new IllegalArgumentException("Felaktig timme");
  }

  public void s�ttMin(int m)  {
    if (m >= 0 && m <=59)
      min = m;
    else
      throw new IllegalArgumentException("Felaktig minut"); 
  }

  public int avl�sTim() {
    return tim;
  }

  public int avl�sMin() {
    return min;
  }

  public String toString() {
    return String.format("%02d:%02d", tim, min);
  }

}
