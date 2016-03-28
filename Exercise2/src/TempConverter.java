import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;

public class TempConverter 
{
	private JPanel panel;
	private JButton FtoC;
	private JButton FtoK;
	private JButton CtoK;
	private JButton CtoF;
	private JButton KtoF;
	private JButton KtoC;
	private JTextField text;
	private JLabel label;
	
	public TempConverter()
	{
		panel = new JPanel();
		FtoC = new JButton("Convert F to C");
		FtoK = new JButton("Convert F to K");
		CtoK = new JButton("Convert C to K");
		CtoF = new JButton("Convert C to F");
		KtoF = new JButton("Convert K to F");
		KtoC = new JButton("Convert K to C");
		text = new JTextField(3);
		label = new JLabel("Enter a temperature from F to C");
		
		//Load the listener
		FtoC.addActionListener(FtoCAction());
		FtoK.addActionListener(FtoKAction());
		CtoK.addActionListener(CtoKAction());
		CtoF.addActionListener(CtoFAction());
		KtoF.addActionListener(KtoFAction());
		KtoC.addActionListener(KtoCAction());
		
		
		//load the panel
		panel.add(text);
		panel.add(FtoC);
		panel.add(FtoK);
		panel.add(CtoK);
		panel.add(CtoF);
		panel.add(KtoF);
		panel.add(KtoC);
		panel.add(label);
	}
	
	public Component getContent()
	{
		return (panel);
	}
	
	private ActionListener FtoCAction()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = text.getText();
				if(input.equals(""))
				{
					/*
					String error = "Please enter a value";
					label.setText(error);
					System.out.println(error);
					*/
					JOptionPane.showMessageDialog(null, "Please enter a value to convert!");
				}
				else
				{
					try
					{
						double tempInF = Double.parseDouble(input);
						double tempInC = (tempInF-32)*(5.0/9.0); //convert F to C
						String newText = "Temp in C: " + String.format("%.2f",tempInC);
						label.setText(newText);
						System.out.println(newText);
						
					}
					catch(NumberFormatException n)
					{
						JOptionPane.showMessageDialog(null, "Please enter a decimal value!");
					}
					
				}
			}
		};
		
		return listener;
	}
	
	private ActionListener FtoKAction()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = text.getText();
				if(input.equals(""))
				{
					/*
					String error = "Please enter a value";
					label.setText(error);
					System.out.println(error);
					*/
					JOptionPane.showMessageDialog(null, "Please enter a value to convert!");
				}
				else
				{
					try
					{
						double tempInF = Double.parseDouble(input);
						double tempInK = (tempInF+459.67)*(5.0/9.0); //convert F to C
						String newText = "Temp in K: " + String.format("%.2f",tempInK);
						label.setText(newText);
						System.out.println(newText);
						
					}
					catch(NumberFormatException n)
					{
						JOptionPane.showMessageDialog(null, "Please enter a decimal value!");
					}
					
				}
			}
		};
		
		return listener;
	}
	
	private ActionListener CtoKAction()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = text.getText();
				if(input.equals(""))
				{
					/*
					String error = "Please enter a value";
					label.setText(error);
					System.out.println(error);
					*/
					JOptionPane.showMessageDialog(null, "Please enter a value to convert!");
				}
				else
				{
					try
					{
						double tempInC = Double.parseDouble(input);
						double tempInK = (tempInC+273.15); 
						String newText = "Temp in K: " + String.format("%.2f",tempInK);
						label.setText(newText);
						System.out.println(newText);
						
					}
					catch(NumberFormatException n)
					{
						JOptionPane.showMessageDialog(null, "Please enter a decimal value!");
					}
					
				}
			}
		};
		
		return listener;
	}
	
	private ActionListener CtoFAction()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = text.getText();
				if(input.equals(""))
				{
					/*
					String error = "Please enter a value";
					label.setText(error);
					System.out.println(error);
					*/
					JOptionPane.showMessageDialog(null, "Please enter a value to convert!");
				}
				else
				{
					try
					{
						double tempInC = Double.parseDouble(input);
						double tempInF = (tempInC*1.80) + 32.0;
						String newText = "Temp in F: " + String.format("%.2f",tempInF);
						label.setText(newText);
						System.out.println(newText);
						
					}
					catch(NumberFormatException n)
					{
						JOptionPane.showMessageDialog(null, "Please enter a decimal value!");
					}
					
				}
			}
		};
		
		return listener;
	}
	
	private ActionListener KtoFAction()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = text.getText();
				if(input.equals(""))
				{
					/*
					String error = "Please enter a value";
					label.setText(error);
					System.out.println(error);
					*/
					JOptionPane.showMessageDialog(null, "Please enter a value to convert!");
				}
				else
				{
					try
					{
						double tempInK = Double.parseDouble(input);
						double tempInF = (tempInK-273.15)*(1.80); //convert F to C
						String newText = "Temp in F: " + String.format("%.2f",tempInF);
						label.setText(newText);
						System.out.println(newText);
						
					}
					catch(NumberFormatException n)
					{
						JOptionPane.showMessageDialog(null, "Please enter a decimal value!");
					}
					
				}
			}
		};
		
		return listener;
	}
	
	private ActionListener KtoCAction()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = text.getText();
				if(input.equals(""))
				{
					/*
					String error = "Please enter a value";
					label.setText(error);
					System.out.println(error);
					*/
					JOptionPane.showMessageDialog(null, "Please enter a value to convert!");
				}
				else
				{
					try
					{
						double tempInK = Double.parseDouble(input);
						double tempInC = (tempInK-273.15);
						String newText = "Temp in C: " + String.format("%.2f",tempInC);
						label.setText(newText);
						System.out.println(newText);
						
					}
					catch(NumberFormatException n)
					{
						JOptionPane.showMessageDialog(null, "Please enter a decimal value!");
					}
					
				}
			}
		};
		
		return listener;
	}
}