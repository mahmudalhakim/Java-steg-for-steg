  static double sigma(double[] f) {
    double term1 = kvadSum(f);
    double sum2 = sum(f);
    double term2 = sum2*sum2/f.length;
    return Math.sqrt((term1-term2)/(f.length-1));
  } 

