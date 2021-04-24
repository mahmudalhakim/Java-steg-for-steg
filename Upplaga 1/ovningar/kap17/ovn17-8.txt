// Filen Observation.java

public class Observation implements Comparable<Observation> {
  int nr;    
  Klockslag tid = new Klockslag();
  double temp; 
  double vindhast; 
  int vindrikt;
  
  public int compareTo(Observation annan) {
    int i = tid.compareTo(annan.tid);
	if (i != 0)
	  return i;
	else if (nr < annan.nr)
	  return -1;
	else if (nr > annan.nr)
	  return 1;
    else	  
      return 0;
  }
}
