import javax.swing.JFrame;

public class BallotDriver 
{
	private static void createAndDisplayGUI()
	{
		JFrame frame = new JFrame("Ballot");
		Ballot ballot1 = new Ballot();
		
		frame.getContentPane().add(ballot1.getContent());
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		createAndDisplayGUI();
	}
}