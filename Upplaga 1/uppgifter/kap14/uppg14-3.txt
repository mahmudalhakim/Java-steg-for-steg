  // Bubble sort

  public static void sortera(int[] a, int start, int slut) {
    boolean byteHarSkett=true; 
    while (byteHarSkett)
    {
      byteHarSkett=false;
      for (int i=start; i<=slut; i++)
        if (a[i]>a[i+1])
        { // i fel ordning, byt plats
          int temp=a[i]; 
          a[i]=a[i+1]; 
          a[i+1]=temp;
          byteHarSkett=true;
        }
    }
  }

