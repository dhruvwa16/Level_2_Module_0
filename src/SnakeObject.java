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
		this.speed = 20;
		tail.add(new Location(x, y));
		tailSize = 2;
		// TODO Auto-generated constructor stub
	}

	void update() {
		super.update();
		if (up) {
			y -= speed;

		}
		else if (down) {
			y += speed;
		}
		else 	if (right) {
			x += speed;
			for (int i = 0; i < tail.size(); i++) {
			System.out.print("["+tail.get(i).x+","+tail.get(i).y+"] ");
			}
			System.out.println("");
		}
		else if (left) {
			x -= speed;
		}
		if (tail.size() > tailSize) {
			tail.remove(0);
		}
		tail.add(new Location(x, y));
	}

	void draw(Graphics g) {
		g.setColor(Color.WHITE);

		g.fillRect(x, y, width, height);
		for (Location l : tail) {
			g.fillRect(l.x, l.y, width, height);
			
			
			
		}
	

	}

	void setTailSize(int tailSize) {
		this.tailSize = tailSize;
	}
 ArrayList<Location> getTail() {
	 return tail;
 }
}
