  public static int binSök(Person[] a, int start, int slut, 
                           String söktFörnamn, String SöktEfternamn) {
  Collator c = Collator.getInstance();
  c.setStrength(Collator.PRIMARY);
   int i1 = start, i2 = slut, m = 0;
   while (i1 <= i2) {
     m = (i1 + i2)/2; 
     if (c.compare(SöktEfternamn, a[m].efternamn) < 0 || 
         (c.compare(SöktEfternamn, a[m].efternamn) == 0 && 
          c.compare(söktFörnamn, a[m].förnamn) < 0))
       i2 = m-1;
     else if (c.compare(SöktEfternamn, a[m].efternamn) > 0 || 
         (c.compare(SöktEfternamn, a[m].efternamn) == 0 && 
          c.compare(söktFörnamn, a[m].förnamn) > 0))
       i1 = m+1;
     else // lika
       break;  // man hittade namnet
   }
   if (c.compare(SöktEfternamn, a[m].efternamn) == 0 && 
       c.compare(söktFörnamn, a[m].förnamn) == 0)
     return m;
   else
     return start-1;
  }

