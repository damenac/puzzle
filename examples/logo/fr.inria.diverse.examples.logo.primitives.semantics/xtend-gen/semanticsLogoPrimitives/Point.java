package semanticsLogoPrimitives;

@SuppressWarnings("all")
public class Point {
  public double x;
  
  public double y;
  
  public Point(final double a, final double b) {
    this.x = a;
    this.y = b;
  }
  
  public Point getDelta(final double dx, final double dy) {
    Point res = new Point(0, 0);
    res.x = (this.x + dx);
    res.y = (this.y + dy);
    return res;
  }
  
  @Override
  public String toString() {
    return (((("[" + Integer.valueOf(((int) this.x))) + ",") + Integer.valueOf(((int) this.y))) + "]");
  }
}
