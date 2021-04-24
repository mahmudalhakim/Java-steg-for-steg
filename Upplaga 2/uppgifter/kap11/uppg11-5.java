  static boolean equals(double[] a, double[] b) {
    if (a == null && b == null)
      return true;             // tv� tomma referenser betraktas som lika
    else if (a == null || b == null)
      return false;            // en referens �r tom men inte den andra 
    else if (a.length != b.length)
      return false;            // olika l�nga arrayer
    for (int i=0; i<a.length; i++)
      if (a[i] != b[i])
        return false;
    return true;
  }
