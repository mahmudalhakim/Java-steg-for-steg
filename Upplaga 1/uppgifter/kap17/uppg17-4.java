// J�mf�rarklassen JfrKort

import java.util.*;

class JfrKort implements Comparator<Kort> {
  public int compare(Kort k1, Kort k2) {
      if (k1.val�r == k2.val�r)
        return 0;
	  else if (k2.val�r == 1)   // Ess h�gst
	    return -1;		
      else if (k1.val�r == 1 || k1.val�r > k2.val�r) 
        return 1;
      else
        return -1;
  }
}


