import java.awt.Color;
import java.awt.Graphics;

public class SnakeObject extends GameObject {
int speed;
boolean up = false;
boolean down = false;
boolean right = false;
boolean left = false;
SnakeObject(int x, int y, int width, int height){
	super(x, y, width, height);
	this.speed = 10;
		// TODO Auto-generated constructor stub
	}
void update(){
	  super.update();
	if (up) {
		y -= speed;
		
	}
	if (down) {
		y += speed;
	}
	if (right) {
		x += speed;
	}
	if (left) {
		x -= speed;
	}
}

void draw(Graphics g) {
    g.setColor(Color.WHITE);

    g.fillRect(x, y, width, height);
}
}
