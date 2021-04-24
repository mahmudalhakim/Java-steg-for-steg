// Rekommenderat filnamn: Primtal.java

class Primtal {

  public static void main(String[] arg) {
    int[] primTab = new int[50];
    boolean prim;
    int antal=0, tal=1;

    while (antal < primTab.length)  {
      tal++;
      prim=true;
      for (int i=0; i<antal && prim; i++)
        if (tal%primTab[i] == 0)
          prim=false;
      if (prim)
        primTab[antal++] = tal;
    } 
    for (int j=0; j<primTab.length; j++)
      System.out.println(primTab[j]);
  }
}

