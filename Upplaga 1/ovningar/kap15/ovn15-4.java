// Filen Punkt.java

public class Punkt {
  double x;
  double y;

  public String toString() {
    return String.format("(%1.1f, %1.1f)", x, y);
  }
}


I programmet kan satsen: 
    JOptionPane.showMessageDialog(null, "Avstånd: " + d + 
                 "\nMittpunkt: (" + c.x + ", " + c.y +")");
förenklas till:
    JOptionPane.showMessageDialog(null, "Avstånd: " + d + 
                                        "\nMittpunkt: " + c);
