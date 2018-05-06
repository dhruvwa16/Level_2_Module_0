
import java.awt.Dimension;

import javax.swing.JFrame;



public class Snake {
	JFrame frame;
	public static final int width = 600;
	public static final int height = 600;
	GamePanel gp;
public static void main(String[] args) {
new Snake().setup();

}
Snake(){
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
	frame.addKeyListener(gp);
}
}
