import java.awt.*;
	import java.awt.event.*;
import javax.swing.*;

public class RulesScreen extends JPanel implements ActionListener
{
	JPanel rules;
	JButton back;
	ImageIcon rulesII, backII;
	JLabel background;

	public RulesScreen()
	{
		rules = new JPanel();
		rules.setLayout(null);
		rules.setBounds(0,0,600,900);
		rulesII = new ImageIcon("Resources\\RulesScreen\\rulesBackground.png");
		background = new JLabel(rulesII);
		background.setBounds(0,0,600,900);

		backII = new ImageIcon("Resources\\RulesScreen\\backButton.png");
		back = new JButton(backII);
		back.setBounds(350, 450, 200, 100);

		rules.add(back);
		rules.add(background);

	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == back)
		{

		}
	}
	public JPanel getRules()
	{
		return rules;
	}
}