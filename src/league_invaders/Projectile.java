package league_invaders;

import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject{
int speed = 10;
Projectile(int x, int y, int width, int height) {
		super(x, y, width, height);
		this.speed = 10;
	}
void update(){
	  super.update();
	y = y - speed;
	if(y<0) {
		boolean isAlive = false;
	}
}
void draw(Graphics g) {
	g.setColor(Color.RED);
	g.drawRect(x, y, height, width);
}
	}

	


