// Filen Klockslag.java
public class Klockslag implements Comparable<Klockslag> {
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


// Filen Observation.java
public class Observation implements Comparable<Observation> {
  int nr;    
  Klockslag tid = new Klockslag();
  double temp; 
  double vindhast; 
  int vindrikt; 

  public int compareTo(Observation annan) {
    return tid.compareTo(annan.tid);
  }
}


// Filen ObsProgram.java
import java.io.*;
import java.util.*;

class ObsProgram {
  public static void main(String[] arg) throws IOException {
    List<Observation> l = new  ArrayList<>();
    Scanner fil = new Scanner(new File("obs.txt"));
    while (fil.hasNext()) {
      Observation obs = new Observation();
      obs.nr  = fil.nextInt();
      obs.tid.tim = fil.nextInt();
      obs.tid.min = fil.nextInt();
      obs.temp = fil.nextDouble();
      obs.vindhast = fil.nextDouble();
      obs.vindrikt = fil.nextInt();
      l.add(obs);
    }
    Collections.sort(l);
    Observation sök = new Observation();
    for (Observation ob : l)
      System.out.println(ob.nr + "  " + ob.tid + "  " + ob.temp);
    Collections.sort(l,new JfrObs());
     for (Observation ob : l)
      System.out.println(ob.nr + "  " + ob.tid + "  " + ob.temp);
  }
}

class JfrObs implements Comparator<Observation> { 
  public int compare(Observation o1, Observation o2) {
    if (o1.nr < o2.nr)
      return -1;
    else if (o1.nr == o2.nr)
      return o1.tid.compareTo(o2.tid);   // i andra hand efter tid
    else 
      return 1;
  }
}
      
    
