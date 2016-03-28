import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.io.*;

public class Ballot 
{
	private JPanel panel;
	private JLabel lastLabel;
	private JLabel firstLabel;
	private JTextField lastName;
	private JTextField firstName;
	private JButton submit;
	private ButtonGroup group;
	private JRadioButton candidate1;
	private JRadioButton candidate2;
	private JRadioButton candidate3;
	private JRadioButton candidate4;
	//FileInputStream in = null;
	//FileOutputStream out = null;
	FileWriter out;
	
	public Ballot()
	{
		lastLabel = new JLabel("Last Name: ");
		lastName = new JTextField(10);
		firstLabel = new JLabel("First Name: ");
		firstName = new JTextField(10);
		submit = new JButton("Submit");
		String cand1 = "Donald Trump";
		String cand2 = "Monica Lewinsky";
		String cand3 = "Vladimir Putin";
		String cand4 = "Bob Marley";
		
		submit.addActionListener(submitAction());
		
		panel = new JPanel();
		group = new ButtonGroup();
		candidate1 = new JRadioButton(cand1);
		candidate2 = new JRadioButton(cand2);
		candidate3 = new JRadioButton(cand3);
		candidate4 = new JRadioButton(cand4);
		candidate1.setSelected(true);
		
		group.add(candidate1);
		group.add(candidate2);
		group.add(candidate3);
		group.add(candidate4);
		
		panel.add(lastLabel);
		panel.add(lastName);
		panel.add(firstLabel);
		panel.add(firstName);
		panel.add(candidate1);
		panel.add(candidate2);
		panel.add(candidate3);
		panel.add(candidate4);
		panel.add(submit);
	}
	
	public Component getContent()
	{
		return (panel);
	}
	
	private ActionListener submitAction()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String last = lastName.getText();
				String first = firstName.getText();
				String name = last + "_" + first + "_" + "ballot";
				String filename = name + ".txt";
				if(last.equals("") || first.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please enter your full name!");
				}
				else
				{
					try
					{
						//in = new FileInputStream("voterNames.txt");
						//out = new FileOutputStream("voterNames.txt");
						File f = new File(filename);
						if(f.exists())
						{
							JOptionPane.showMessageDialog(null, "You have already voted!");
						}
						else
						{
							out = new FileWriter(filename);
							if(candidate1.isSelected())
								out.write("Donald Trump");
							else if(candidate2.isSelected())
								out.write("Monica Lewinsky");
							else if(candidate3.isSelected())
								out.write("Vladimir Putin");
							else
								out.write("Bob Marley");
							out.close();
						}
						
					}
					catch(IOException f)
					{
						JOptionPane.showMessageDialog(null, "File not found!");
					}
					
					try (BufferedReader br = new BufferedReader(new FileReader(filename)))
					{
					    String line;
					    while ((line = br.readLine()) != null) 
					    {
					       if(line == name)
					    	   JOptionPane.showMessageDialog(null, "You already voted!");
					    }
					}
					catch(IOException ioe)
					{
						JOptionPane.showMessageDialog(null, "File not found!");
					}
					
				}
			}
		};
		
		return listener;
	}
	
}
