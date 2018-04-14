import java.awt.Graphics;
import java.util.Random;

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
	void checkCollision() {
    if(snake.collisionBox.intersects(food.collisionBox)){
    	 snake.height = snake.height + 19;
    	 Random a = new Random();
    	 int  n = a.nextInt(601)/19 * 19;
    	 food.x = n;
	 int  b = a.nextInt(601)/20 * 19;
	 food.y = b;
    }


        }
	}


	

