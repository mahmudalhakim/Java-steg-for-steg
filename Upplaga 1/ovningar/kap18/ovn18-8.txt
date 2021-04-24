  public void läggFörst(Object nyttElem) { 
    DListElement ny = new DListElement();
    ny.elem = nyttElem;
    ny.nästa = start.nästa; 
    ny.förra = start;
    start.nästa.förra = ny;
    start.nästa = ny;
    storlek++;
  }

