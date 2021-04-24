// Filen HusTest.java
public class HusTest {
  public static void main(String[] arg) {
	Hus[] a = new Hus[20];
	a[0] = new Hus(15, 9, 1);                // FEL! Abstrakt klass
	a[1] = new Skola(25, 18, 3, 20);
	a[2] = new Bostadshus(10, 6, 1, true);   // FEL! Abstrakt klass
	a[3] = new Flerfamiljshus(30, 20, 4, true, 20);
	for (Hus h : a) 
	  if (h != null)
	    System.out.println(h.yta());
  }
}