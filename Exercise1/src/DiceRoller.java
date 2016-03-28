import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.Random;

public class DiceRoller {

	private JPanel panel;
	private JButton button;
	private JTextField text;
	private JLabel label;
	private JLabel picture;
	Random randomGenerator = new Random();
	
	public DiceRoller()
	{
		panel = new JPanel();
		button = new JButton("Roll");
		text = new JTextField(8);
		label = new JLabel("Enter number of sides for your dice: ");
		picture = new JLabel(new ImageIcon("d24.jpg"));
		
		button.addActionListener(buttonListener());
		
		//loading the panel
		panel.add(text);
		panel.add(button);
		panel.add(label);
		panel.add(picture);
		
	}
	
	public Component getContent()
	{
		return (panel);
	}
	
	private ActionListener buttonListener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = text.getText();
				int sides = Integer.parseInt(input);
				int result = randomGenerator.nextInt(sides + 1);
				while(result == 0)
					result = randomGenerator.nextInt(sides + 1);
				String newText = "You rolled: " + result + ".";
				label.setText(newText);
				System.out.println(newText);
			}
		};
		
		return listener;
	}
}
