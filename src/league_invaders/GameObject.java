package league_invaders;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class GameObject {
	 	int x = 0;	
		int y = 0;
	    int width;
	    int height;
 Rectangle collisionBox;
 boolean isAlive = true;
GameObject(int x, int y, int width, int height) {
	 this.x = x;
     this.y = y;
	 this.width = width;
	 this.height = height;
	 collisionBox = new Rectangle(x, y, width, height);
}
void update() {
	   collisionBox.setBounds(x, y, width, height);
}
void draw(Graphics g) {
	

}
}
