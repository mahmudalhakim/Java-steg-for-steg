// Rekommenderat namn: KvadTab.java

class KvadTab {
  public static void main (String[] arg) {
    int r = 2;
    for (int n=1; n<=30; r*=2, n++)
      System.out.format("%2d%,15d\n", n, r); 	  
  }
}