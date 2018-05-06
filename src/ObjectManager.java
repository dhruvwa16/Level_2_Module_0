import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Iterator;
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
		int score = 0;
	if (snake.collisionBox.intersects(food.collisionBox)) {
			score++;
			snake.tailSize++;
			Random a = new Random();
			int n = a.nextInt(601) / 20 * 20 -20;
			food.x = n;
			int b = a.nextInt(601) / 20 * 20 -20;
			food.y = b;
		}
		for (Location tail : snake.getTail()) {
			if(tail.collisionBox.intersects(food.collisionBox)) {
			score++;
			//snake.height = snake.height + 20;
			snake.tailSize++;
			Random a = new Random();
			int n = a.nextInt(601) / 20 * 20;
			food.x = n;
			int b = a.nextInt(601) / 20 * 20;
			food.y = b;
			}
		
		}
		
	}
}
