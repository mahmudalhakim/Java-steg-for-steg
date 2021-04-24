  static void arraycopy(double[] från, int startpos1, 
                        double[] till, int startpos2, int antal) {
    int i, j, k;
    if (från != till)  // två olika arrayer 
      for (i=0, j=startpos1, k=startpos2; i < antal; i++, j++, k++)
        till[k] = från[j];
    else {   // kopiering till samma array 
      // kopiera först till en temporär array    
      double temp[] = new double[antal];
      for (i=0, j=startpos1; i < antal; i++, j++)
        temp[i] = från[j];
      for (i=0, k=startpos2; i < antal; i++, k++)
        till[k] = temp[i];
    }
  } 

