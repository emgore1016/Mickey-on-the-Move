import java.awt.*;
	import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class DriverMOTM extends JFrame implements ActionListener
{
	public static void main(String[] args)
	{
		DriverMOTM d = new DriverMOTM();
		d.start();
	}

	JPanel menu, game, winScreen, credits, rules;
	MenuScreen ms = new MenuScreen();
	PlayScreen ps = new PlayScreen();
	RulesScreen rs = new RulesScreen();
	//CreditsScreen cs = new CreditsScreen();

	boolean menuStatus, gameStatus, rulesStatus, creditsStatus;

	public void start()
	{
		setPreferredSize(new Dimension(600, 900));;
		setTitle("Mickey on the Move");
		setVisible(true);
		menu = new JPanel();
		menu = ms.getMenu();
		game = new JPanel();
		game = ps.getGame();
		rules = new JPanel();
		rules = rs.getRules();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();

		setContentPane(menu);
	}

	public void actionPerformed(ActionEvent e)
	{

	}
	public class DrawingPanel extends JPanel
   	{
   		public void paintComponent(Graphics g)
   		{
			super.paintComponent(g);
		}

	}
}