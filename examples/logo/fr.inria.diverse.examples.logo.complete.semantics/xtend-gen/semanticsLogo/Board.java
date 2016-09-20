package semanticsLogo;

import java.awt.Graphics;
import javax.swing.JPanel;
import semanticsLogo.Segment;
import semanticsLogo.Turtle;

@SuppressWarnings("all")
public class Board extends JPanel {
  private Turtle turtle;
  
  public Board(final Turtle t) {
    this.turtle = t;
  }
  
  @Override
  public void paint(final Graphics g) {
    for (final Segment seg : this.turtle.drawings) {
      g.drawLine(((int) seg.begin.x), ((int) seg.begin.y), 
        ((int) seg.end.x), ((int) seg.end.y));
    }
  }
}
