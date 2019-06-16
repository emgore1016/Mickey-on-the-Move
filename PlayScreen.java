import java.awt.*;
	import java.awt.event.*;
import javax.swing.*;

public class PlayScreen extends JPanel implements ActionListener, MouseListener
{
	JPanel game;
	public PlayScreen()
	{
		game = new JPanel();
		game.setLayout(null);
		game.setBounds(0,0,600,900);
		game.setBackground(new Color(200,35,203));
	}
	public void actionPerformed(ActionEvent e)
	{

	}
 	public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mouseClicked(MouseEvent e) {}

	public JPanel getGame()
	{
		return game;
	}
}