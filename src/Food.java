import java.awt.Color;
import java.awt.Graphics;

public class Food extends GameObject{

	Food(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
void update() {
 
}
void draw(Graphics g) {
    g.setColor(Color.RED);

    g.fillRect(x, y, width, height);
}

}
