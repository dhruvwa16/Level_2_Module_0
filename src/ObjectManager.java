import java.awt.Graphics;
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

	}

	void draw(Graphics g) {
		snake.draw(g);
		food.draw(g);
	}

	void checkCollision() {
		int score = 0;
		if (snake.collisionBox.intersects(food.collisionBox)) {
			score++;
			snake.height = snake.height + 20;
			Random a = new Random();
			int n = a.nextInt(601) / 20 * 20;
			food.x = n;
			int b = a.nextInt(601) / 20 * 20;
			food.y = b;
		}

	}
}
