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
	void checkCollision() {
for (int i = 0; i <600; i+=20) {
	   snake.height = snake.height + 20;
    if(snake.collisionBox.intersects(food.collisionBox)){

         
           food.x = i;
            food.y =i;

    }
	
}
       

        }
	}


	

