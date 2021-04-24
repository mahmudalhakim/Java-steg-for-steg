  static boolean equals(double[] a, double[] b) {
    if (a == null && b == null)
      return true;             // två tomma referenser betraktas som lika
    else if (a == null || b == null)
      return false;            // en referens är tom men inte den andra 
    else if (a.length != b.length)
      return false;            // olika långa arrayer
    for (int i=0; i<a.length; i++)
      if (a[i] != b[i])
        return false;
    return true;
  }
