package league_invaders;

import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject {

	Alien(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}
void update(){
	  super.update();
	y+=5;
}
void draw(Graphics g) {
	g.setColor(Color.YELLOW);
	g.drawRect(x, y, height, width);
}
}
