  public static double langd(List<Double> vekt) {
    double sum=0;
    for (Double d: vekt) {
      double x = d;
      sum += x * x;
    }
    return Math.sqrt(sum); 
  }
