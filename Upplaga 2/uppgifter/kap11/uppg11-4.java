  static void arraycopy(double[] fr�n, int startpos1, 
                        double[] till, int startpos2, int antal) {
    int i, j, k;
    if (fr�n != till)  // tv� olika arrayer 
      for (i=0, j=startpos1, k=startpos2; i < antal; i++, j++, k++)
        till[k] = fr�n[j];
    else {   // kopiering till samma array 
      // kopiera f�rst till en tempor�r array    
      double temp[] = new double[antal];
      for (i=0, j=startpos1; i < antal; i++, j++)
        temp[i] = fr�n[j];
      for (i=0, k=startpos2; i < antal; i++, k++)
        till[k] = temp[i];
    }
  } 

