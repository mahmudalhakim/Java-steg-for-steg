  static double sum(double[] f) {
    double sum = 0;
    for (int i=0; i<f.length; i++)
     sum += f[i];
    return sum;
  }
 
  static double kvadSum(double[] f) {
    double sum = 0;
    for (int i=0; i<f.length; i++)
     sum += f[i] * f[i];
    return sum;
  }

