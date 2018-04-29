import java.awt.Rectangle;

public class Location {
	int x;
	int y;
	Rectangle collisionBox;
	Location(int x, int y) {
		this.x = x;
		this.y = y;
		 collisionBox = new Rectangle(x, y, 20, 20);
	}
	  void update() {
	        collisionBox.setBounds(x, y, 20, 20);
	    }
}
