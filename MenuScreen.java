import java.awt.*;
	import java.awt.event.*;
import javax.swing.*;

public class MenuScreen extends JPanel implements ActionListener
{
	JPanel menu;
	JLabel background;
	JLabel title;
		ImageIcon titleII;
		Image titleI;
	JButton play, rules, credits;
	ImageIcon backgroundII, playII, rulesII, creditsII;

	boolean startGame = false, showCredits = false, showRules = false;

	public MenuScreen()
	{
		menu = new JPanel();
		menu.setLayout(null);
		menu.setBounds(0,0,600,900);
		backgroundII = new ImageIcon("Resources\\MainMenuImages\\background.png");
		background = new JLabel(backgroundII);
		background.setBounds(0,0,600,900);
		menu.add(background);
		titleII = new ImageIcon("Resources\\MainMenuImages\\Title.png");
		title = new JLabel(titleII);
		title.setBounds(25,125,550,100);

		playII = new ImageIcon("Resources\\MainMenuImages\\playButton.png");
		play = new JButton(playII);
			play.setBounds(200,350,200,50);
			play.setBorderPainted(false);
			play.setContentAreaFilled(false);
			play.addActionListener(this);
		rulesII = new ImageIcon("Resources\\MainMenuImages\\rulesButton.png");
		rules = new JButton(rulesII);
			rules.setBounds(200,450,200,50);
			rules.setBorderPainted(false);
			rules.setContentAreaFilled(false);
			rules.addActionListener(this);
		creditsII = new ImageIcon("Resources\\MainMenuImages\\creditsButton.png");
		credits = new JButton(creditsII);
			credits.setBounds(200,550,200,50);
			credits.setBorderPainted(false);
			credits.setContentAreaFilled(false);
			credits.addActionListener(this);

		menu.add(title);
		menu.add(play);
		menu.add(rules);
		menu.add(credits);
		menu.add(background);

	}
	public void actionPerformed(ActionEvent e)
	{
		/*if(e.getSource() == play)
		{
			//System.out.println("play");
			//startGame = true;

		}
		if(e.getSource() == rules)
		{
			System.out.println("rules");
		}
		if(e.getSource() == credits)
		{
			System.out.println("credits");
		}*/
	}
	public void startGameStatus(boolean sgs)
	{
		startGame = sgs;
	}
	public boolean getGameStatus()
	{
		return startGame;
	}
	public JPanel getMenu()
	{
		return menu;
	}
}