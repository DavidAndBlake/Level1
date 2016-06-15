import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.IOException;

public class SimonSays extends KeyAdapter {

	// Complete steps 1 - 7 before you test
	// 1. Make a JFrame variable
	JFrame frame;
	HashMap<Integer, String> images = new HashMap<Integer, String>();
	private int imageIndex;
	private int tries = 0;
	private int simonSays = 0;
	Date timeAtStart;

	private void makeAlbum() {
		// 2. add 4 images which match keyboard keys like this: images.put(new Integer(KeyEvent.VK_UP), "image.jpg");
		images.put(new Integer(KeyEvent.VK_RIGHT), "biggerRightArrow.png");
		images.put(new Integer(KeyEvent.VK_DOWN), "DownArrow.png");
		images.put(new Integer(KeyEvent.VK_UP), "GreenUpArrow.png");
		images.put(new Integer(KeyEvent.VK_LEFT), "leftArrow.png");
		// 3. Tell the user to "Press the matching key when 'Simon says' otherwise press a different key"
		JOptionPane.showMessageDialog(null, "Press the key that is said when the instructions say: Simon Says. \nIf the instructions don't say Simon Says, press another key.");
		// 4. call the method to show an image
		showImage();
	}

	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		// 16. make a points variable to track the score. tell the user their score at the end.
		// 17. if the keyCode matches the imageIndex and "Simon says..." increase their score
		// 18. if the keyCode doesn't match the imageIndex and "Simon didn't say..." increase their score
		// 19. Use the speak method to tell the user if they were correct or not
		// 13. increment tries by 1
		tries = tries + 1;
		// 14. if tries is greater than 9 (or however many you want)
		if (tries > 9)
		// 15. exit the program
		{
			System.exit(0);
		}
		// 11. dispose of the frame
		frame.dispose();
		// 12. call the method to show an image
		showImage();
	}

	private void showImage() {
		// 5. initialize your frame to a new JFrame()
		frame = new JFrame();
		// 6. set the frame to visible
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(getNextRandomImage()); // 7. rename to the name of your frame

		// 8. set the size of the frame
		frame.setSize(522, 520);
		// 9. add a key listener to the frame
		frame.addKeyListener(this);
		// 10. Use the speak method to either say "Simon says press this key" or "Press this key"
		// Hint: use the simonSays int and a random number
		int decider = new Random().nextInt(2);

		if (decider == 0) {
			speak("Simon says press the key.");
		}
		if (decider == 1) {
			speak("Press the key.");
		}
	}

	private Component getNextRandomImage() {
		this.imageIndex = new Random().nextInt(4) + 37;
		return loadImage(images.get(imageIndex));
	}

	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		new SimonSays().makeAlbum();
	}
}

/*
 * 20. add a timer ~~~ where the code starts running ~~~ timeAtStart = new Date();
 *
 * ~~~ where the code ends ~~~ Date timeAtEnd = new Date();
 * System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000); System.exit(0);
 */
