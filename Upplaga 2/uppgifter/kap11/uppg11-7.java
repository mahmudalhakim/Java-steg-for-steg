  static void rotera(int[] a) {
    int temp = a[a.length-1];
    for (int i=a.length-1; i>=1; i--)
      a[i] = a[i-1];
    a[0] = temp;
  } 

