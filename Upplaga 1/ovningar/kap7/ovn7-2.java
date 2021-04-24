Man kan ändra for-satsen så att den ser ut på följande sätt:

    for (int i=1; i<=t.length() && ok; i++)
      if (t.charAt(i) < '0' || t.charAt(i) > '9')
        ok = false;       // inte längre korrekt 

