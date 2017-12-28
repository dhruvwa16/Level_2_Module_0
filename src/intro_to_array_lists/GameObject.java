package intro_to_array_lists;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class GameObject {
	 int x = 10;
      int y = 10;
      int width = 30;
      int height = 30;

GameObject() {
	int x;	
	int y;
    int width;
    int height;
}
void update() {
x+=5;
}
void draw(Graphics g) {
	 g.fillRect(x, y, width, height);

}
}
