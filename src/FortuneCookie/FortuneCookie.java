package FortuneCookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FortuneCookie implements ActionListener {

	public static void main(String[] args) {

		FortuneCookie fortune = new FortuneCookie();
		fortune.showButton();

	}

	public void showButton() {
		System.out.println("hello");
		JFrame fortuneCookieFrame = new JFrame();
		fortuneCookieFrame.setVisible(true);
		JButton butt = new JButton();
		butt.setVisible(true);
		fortuneCookieFrame.add(butt);
		butt.setText("this is text in a button");
		butt.addActionListener(this);
		fortuneCookieFrame.setDefaultCloseOperation(fortuneCookieFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	int rand = new Random().nextInt(5);
	if (rand == 0)
			{
		System.out.println("You will finish reading a fortune cookie's fortune");
			}
	if (rand == 1)
	{
		System.out.println("You will click a button with a red X on it.");
	}
	if (rand == 2)
	{
		System.out.println("Your eyes are often used to read words like these.");
	}
	if (rand == 3)
	{
		System.out.println("You clicked a computer mouse today.");
	}
	if (rand == 4)
	{
		System.out.println("You are reading a fortune that says something obvious.");
	}
	}
	
}
