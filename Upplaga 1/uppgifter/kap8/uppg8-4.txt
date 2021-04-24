// Filen Skatt.java

import javax.swing.*;

public class Skatt {

  public static final double MOMS       = 25.0;
  public static final double EGEN_AVG   = 28.97;
  public static final double STAT_LÅG   = 0.0;
  public static final double STAT_MEDEL = 20.0;
  public static final double STAT_HÖG   = 25.0;
  public static final int LÅG   = 1;
  public static final int MEDEL = 2;
  public static final int HÖG   = 3;

  public static double pris(double x, double kommunal, int nivå) {
    
    // beräkna skatteprocenten p
    double p;
    if (nivå == LÅG)
      p = kommunal + STAT_LÅG;
    else if (nivå == MEDEL) 
      p = kommunal + STAT_MEDEL;
    else  // antag hög nivå
      p = kommunal + STAT_HÖG;	  
    // beräkna lönen före skatt
    double lön = x/(1-0.01*p);
    // lägg till arbetsgivaravgift   
    double tot = lön + lön*0.01*EGEN_AVG;
    // lägg till moms
    double inklMoms = tot + tot*0.01*MOMS;
    return inklMoms;
  }

  public static void main(String[] arg) {
    String s = JOptionPane.showInputDialog("Kommunalskatt i procent?");
	if (s == null)
	  System.exit(0);
    double kom = Double.parseDouble(s);
	s = JOptionPane.showInputDialog("Inkomstnivå (1, 2 eller 3)?");
	if (s == null)
	  System.exit(0);;
    int nivå = Integer.parseInt(s);
    while (true) {
      s = JOptionPane.showInputDialog("Önskat belopp?");
	  if (s == null)
	    break;
      double ö = Double.parseDouble(s);
	  JOptionPane.showMessageDialog(null, "Pris: " + pris(ö, kom, nivå));
    }
  }
}
    
