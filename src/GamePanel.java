import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;
public class GamePanel extends JPanel implements ActionListener, KeyListener{
Timer timer;
Font titlefont;
Font font;
SnakeObject snake;
ObjectManager object;
Food food;
int score = 0;
ObjectManager object2;
final int MENU_STATE = 0;

final int GAME_STATE = 1;

final int END_STATE = 2;
int currentState =  MENU_STATE;
void updateMenuState(){
	
}
void updateGameState(){
	if(snake.x>600) {
		currentState++;
	}
	if(snake.y>600) {
		currentState++;
	}
	if(snake.x<0) {
		currentState++;
	}
	if(snake.y<0) {
		currentState++;
	}
  List<Location>tail = snake.getTail();
  for(int i = 0; i < tail.size(); i++ ) {
		for (int j = i+1; j < tail.size(); j++) {
			if (tail.get(j).x==tail.get(i).x &&tail.get(j).y==tail.get(i).y&&snake.x!=80) {
				snake.tailSize = 0;
				currentState++;
			}

		}
		}
	if (snake.x==food.x&&snake.y==food.y) {
		score++;
}
}	
void updateEndState(){

	}

void drawMenuState(Graphics g){
	g.setFont(titlefont);
	g.setColor(Color.GREEN);
	g.drawString("Snake", 150,200);
    g.setFont(font);
    g.drawString("Press enter to start", 100, 300);
}
void drawGameState(Graphics g){
	g.setColor(Color.GREEN);
	g.fillRect(0,0, 600, 600);
	for (int i = 20; i < 600; i+=20) {
		g.setColor(Color.BLUE);
	g.drawRect(0, i, 600, 1);
		g.drawRect(i, 0, 1, 600);
	}
	object.draw(g);
	g.setColor(Color.WHITE);
g.fillRect(100, 80, 100, 20);
}
void drawEndState(Graphics g){
	g.setFont(titlefont);
	g.setColor(Color.BLACK);
	g.drawString("Game Over", 75,200);
    g.setFont(font);
    g.drawString("Your ate "+ score +
    		 " apples", 150, 300);
}
int fps = 10;
GamePanel(){
	timer = new Timer(1000/fps, this);
titlefont = new Font("Arial",Font.PLAIN,96);
font = new Font("Arial",Font.PLAIN,48);
snake = new SnakeObject(80, 80, 20, 20);

object = new ObjectManager(snake);
food = new Food(40,40,20,20);
object.addFood(food);
}
@Override
public void actionPerformed(ActionEvent e) {
	repaint();
	if(Math.random() > 0.5) {
		fps++;
		timer.setDelay(1000/fps);
	}
	  if(currentState == MENU_STATE){
		  score =0;
          updateMenuState();

  }else if(currentState == GAME_STATE){

          updateGameState();

  }else if(currentState == END_STATE){
	  System.out.println("reset");
	  fps = 10;
	  timer.setDelay(1000/fps);
	  snake = new SnakeObject(80, 80, 20, 20);
	  object = new ObjectManager(snake);
	  food = new Food(40,40,20,20);
	  object.addFood(food);
	  
      updateEndState();
  }
	  object.checkCollision();
}
void StartGame() {
	timer.start();
}
@Override
public void keyTyped(KeyEvent b) {
	// TODO Auto-generated method stub
	if (b.getKeyChar() == KeyEvent.VK_ENTER) {
		currentState++;
	if(currentState > END_STATE){

        currentState = MENU_STATE;
	}

}	
}
@Override
public void keyPressed(KeyEvent b) {
	// TODO Auto-generated method stub
	if (b.getKeyCode() == KeyEvent.VK_UP) {
		if(snake.down == true) {
			snake.down = true;
		}
		else {
		snake.up = true;
		snake.down = false;
		snake.right = false;
		snake.left = false;
		
		
		}
	}
	
	if (b.getKeyCode() == KeyEvent.VK_DOWN) {
		if(snake.up == true) {
			snake.up = true;
		}
		else{
			snake.up = false;
		snake.down = true;
		snake.right = false;
		snake.left = false;
		}
	}
	if (b.getKeyCode() == KeyEvent.VK_RIGHT) {
		if(snake.left == true) {
			snake.left = true;
		}
		else {
		snake.up = false;
		snake.down = false;
		snake.right = true;
		snake.left = false;
		}
	}
	if (b.getKeyCode() == KeyEvent.VK_LEFT)	{
		if(snake.right == true) {
			snake.right = true;
		}
		else {
		snake.up = false;
		snake.down = false;
		snake.right = false;
		snake.left = true;
	}
	}
	
}	

@Override
public void keyReleased(KeyEvent c) {
	
}
@Override

public void paintComponent(Graphics g){
    if(currentState == MENU_STATE){
    	g.setColor(Color.BLACK);

    	g.fillRect(0, 0, Snake.width, Snake.height);   
        drawMenuState(g);

}else if(currentState == GAME_STATE){
	g.setColor(Color.GREEN);

	//g.fillRect(0, 0, Snake.width, Snake.height);   
  
        drawGameState(g);

}else if(currentState == END_STATE){
	g.setColor(Color.RED);

	g.fillRect(0, 0, Snake.width, Snake.height);   
   
        drawEndState(g);

}


                

        }


}
