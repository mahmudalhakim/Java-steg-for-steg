  public void läggIn(int index, Object nyttElem) { 
    if (index < 0 || index > storlek) 
      throw new IndexOutOfBoundsException();
    else {
      DListElement p = start.nästa;   
      for (int i = 0; i < index; i++)
        p = p.nästa;
      // Lägg in det nya elementet före p
      DListElement ny = new DListElement();
      ny.elem = nyttElem;
      ny.nästa = p; 
      ny.förra = p.förra;
      p.förra.nästa = ny;
      p.förra = ny;
      storlek++;
    }
  }
