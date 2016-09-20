package CompleteDSL;

import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import CompleteDSL.Point;
import CompleteDSL.Segment;

@SuppressWarnings("all")
public class Turtle {
  private Point position;
  
  private double heading;
  
  private boolean penUp;
  
  public ArrayList<Segment> drawings;
  
  public Turtle() {
    this.reset();
  }
  
  public void reset() {
    Point _point = new Point(250, 200);
    this.position = _point;
    this.heading = 0;
    this.penUp = false;
    ArrayList<Segment> _arrayList = new ArrayList<Segment>();
    this.drawings = _arrayList;
  }
  
  public void setPenUp(final boolean b) {
    this.penUp = b;
  }
  
  public double rotate(final int angle) {
    return this.heading = ((this.heading + angle) % 360);
  }
  
  public void move(final double dx, final double dy) {
    Point newPos = this.position.getDelta(dx, dy);
    if (this.penUp) {
      String _string = newPos.toString();
      String _plus = ("Turtle move to " + _string);
      InputOutput.<String>println(_plus);
    } else {
      String _string_1 = newPos.toString();
      String _plus_1 = ("Turtle trace to " + _string_1);
      InputOutput.<String>println(_plus_1);
      Segment _segment = new Segment(this.position, newPos);
      this.drawings.add(_segment);
    }
    this.position = newPos;
  }
  
  public void forward(final int steps) {
    double radian = Math.toRadians(this.heading);
    double _sin = Math.sin(radian);
    double _scale = this.scale(steps, _sin);
    double _cos = Math.cos(radian);
    double _scale_1 = this.scale(steps, _cos);
    this.move(_scale, _scale_1);
  }
  
  /**
   * scale the "steps" by factor
   */
  public double scale(final int steps, final double factor) {
    return (steps * factor);
  }
}
