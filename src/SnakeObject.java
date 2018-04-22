import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class SnakeObject extends GameObject {
	int speed;
	int tailSize;
	boolean up = false;
	boolean down = false;
	boolean right = false;
	boolean left = false;
	ArrayList<Location> tail = new ArrayList<Location>();
	SnakeObject(int x, int y, int width, int height) {
		super(x, y, width, height);
		this.speed = 5;
		tail.add(new Location(x, y));
		// TODO Auto-generated constructor stub
	}

	void update() {
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
		for (Location l : tail) {
			g.drawRect(l.x, l.y, width, height);
		}
		if (tail.size() > tailSize) {
			tail.remove(0);
			tail.add(new Location(x, y));
		}

	}

	void setTailSize(int tailSize) {
		this.tailSize = tailSize;
	}

}
