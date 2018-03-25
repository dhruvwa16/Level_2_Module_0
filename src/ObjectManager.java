import java.awt.Graphics;

public class ObjectManager {
	SnakeObject snake;
	Food food;
	
	ObjectManager(SnakeObject snake){
		this.snake =snake;
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
}
