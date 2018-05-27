import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ObjectManager {
	SnakeObject snake;
	Food food;

	ObjectManager(SnakeObject snake) {
		this.snake = snake;
	}

	void addFood(Food food) {
		this.food = food;
	}

	void update() {
		snake.update();
		food.update();
      
	}

	void draw(Graphics g) {
		snake.draw(g);
		food.draw(g);
		
	}

	void checkCollision() {
		if (snake.x==food.x&&snake.y==food.y) {
			snake.tailSize++;
			Random a = new Random();
			int n = a.nextInt(601) / 20 * 20;
			food.x = n;
			int b = a.nextInt(601) / 20 * 20;
			food.y = b;
			List<Location>tail = snake.getTail();
		}
		List<Location>tail = snake.getTail();	
		
	for(int i = 0; i < tail.size(); i++ ) {
		for (int j = i+1; j < tail.size(); j++) {
			if (tail.get(j).x==tail.get(i).x &&tail.get(j).y==tail.get(i).y) {
				snake.tailSize = 0;
			
			}

		}
		
		}

	}
}
