package semanticsLogo;

import javax.swing.JFrame;
import semanticsLogo.Board;
import semanticsLogo.Turtle;

@SuppressWarnings("all")
public class Window {
  private JFrame frame;
  
  public Window(final Turtle t) {
    JFrame _jFrame = new JFrame();
    this.frame = _jFrame;
    this.frame.setBounds(100, 100, 500, 500);
    this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.frame.setTitle("Logo example");
    this.frame.setVisible(true);
    Board panel = new Board(t);
    this.frame.add(panel);
    panel.revalidate();
  }
}
