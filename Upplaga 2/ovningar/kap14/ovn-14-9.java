// Rekommenderat filnamn: Observation.java

class Observation implements Comparable<Observation> {
  int nr;    
  Klockslag tid = new Klockslag();
  double temp; 
  double vindhast; 
  int vindrikt;
   
  public int compareTo(Observation annan) {
    int test = tid.compareTo(annan.tid);
    if (test != 0)
      return test;
    else
      return nr - annan.nr;
  }
}

class Klockslag implements Comparable<Klockslag> {
  int tim;
  int min;
  
  public int compareTo(Klockslag k) {
    if  (tim < k.tim || (tim == k.tim && min < k.min))
      return -1;
    else if (tim > k.tim || (tim == k.tim && min > k.min))
      return 1;
    else
      return 0;
  }
  
  @Override
  public String toString() {
    return String.format("%02d:%02d", tim, min);
  }
}