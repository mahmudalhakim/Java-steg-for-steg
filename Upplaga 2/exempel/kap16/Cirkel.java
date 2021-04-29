public class Cirkel {
  // instansvariabler
  public double x, y;     // mittpunktens koordinater
  private double radie;
  
  // instansmetoder  
  public void s�ttRadie(double r) {  // �ndrar radien  
    if (r >= 0)
      radie = r;
    else
      throw new IllegalArgumentException("Negativ radie");
  }
  
  public double avl�sRadie() {
    return radie;
  } 

  public double area() {             // ber�knar arean
    return Math.PI * radie * radie;
  } 
  
  public double omkr() {             // ber�knar omkretsen
    return 2 * Math.PI * radie;
  }

}