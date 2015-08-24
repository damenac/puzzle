package logo;

import logo.Point;

@SuppressWarnings("all")
public class Segment {
  public Point begin;
  
  public Point end;
  
  public Segment(final Point orig, final Point dest) {
    this.begin = orig;
    this.end = dest;
  }
}
