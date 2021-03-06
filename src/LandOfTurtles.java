import java.util.Random;

import javax.swing.JFrame;
import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

// 1. Create a frame & make it visible
JFrame frame = new JFrame();
frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
frame.setVisible(true);
		// 2. Add the panel to the frame
		frame.add(panel);
		// 3. Set the background image of the panel to the Galapagos Islands 
		panel.showPanel();
panel.setBackgroundImage(galapagosIslands);
		// 4. Instantiate a Turtle 
Turtle turtle = new Turtle();

// 5. Add the turtle to the panel 
turtle.setX(500);
turtle.setY(500);
panel.addTurtle(turtle);
// 6. Put 50 Turtles on the beach
for (int i = 0; i < 50; i++) {
	turtle = new Turtle();
	Random random = new Random();
	panel.addTurtle(turtle);
	turtle.setX(random.nextInt(panel.getHeight()));
	turtle.setY(random.nextInt(panel.getWidth()));
}
	}
}
