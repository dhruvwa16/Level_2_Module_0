package intro_to_array_lists;

import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	final int width = 500;
	final int height = 800;
	GamePanel gp;
public static void main(String[] args) {
new LeagueInvaders().setup();

}
LeagueInvaders(){
frame = new JFrame();
frame.setSize(width, height);
gp = new GamePanel();
}
void setup() {
	frame.add(gp);
	frame.getContentPane().setPreferredSize(new Dimension(width, height));
    frame.pack();


	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	gp.StartGame();
}

	
}




