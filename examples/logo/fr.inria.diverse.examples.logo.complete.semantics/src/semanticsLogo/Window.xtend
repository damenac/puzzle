package semanticsLogo

import javax.swing.JFrame
import java.awt.Graphics
import javax.swing.JPanel

class Window {
	
	JFrame frame;
	
	new(Turtle t){
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Logo example");
		frame.setVisible(true)
		var Board panel = new Board(t)
		frame.add(panel)
		panel.revalidate
	}
	
}

class Board extends JPanel{
	
	Turtle turtle;
	
	new(Turtle t){
		turtle = t
	}
	
	override paint(Graphics g){
		for(Segment seg : turtle.drawings){
			g.drawLine(	seg.begin.x as int,seg.begin.y as int,
						seg.end.x as int,seg.end.y as int
			)
		}		
	}
	
}