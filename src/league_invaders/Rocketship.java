package league_invaders;

import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	int speed;
	boolean up = false;
	boolean down = false;
	boolean right = false;
	boolean left = false;

	Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		this.speed = 5;
		System.out.println("constructor");
	}

	void update() {
		if (up) {
			System.out.println("y: " + y);
			this.y -= speed;
			
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
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}
}