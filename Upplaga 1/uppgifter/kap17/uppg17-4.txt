// Jämförarklassen JfrKort

import java.util.*;

class JfrKort implements Comparator<Kort> {
  public int compare(Kort k1, Kort k2) {
      if (k1.valör == k2.valör)
        return 0;
	  else if (k2.valör == 1)   // Ess högst
	    return -1;		
      else if (k1.valör == 1 || k1.valör > k2.valör) 
        return 1;
      else
        return -1;
  }
}


