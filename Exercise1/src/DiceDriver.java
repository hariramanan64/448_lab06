import javax.swing.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.*;

public class DiceDriver 
{
	private static void createAndDisplayGUI()
	{
		JFrame frame = new JFrame("Dice roller");
		DiceRoller roller = new DiceRoller();
		
		frame.getContentPane().add(roller.getContent());
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args)
	{
		createAndDisplayGUI();
	}
}
