import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import league_invaders.Rocketship;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
Timer timer;
Font titlefont;
Font font;
SnakeObject snake;
ObjectManager object;
Food food;
ObjectManager object2;
final int MENU_STATE = 0;

final int GAME_STATE = 1;

final int END_STATE = 2;
int currentState =  MENU_STATE;
void updateMenuState(){
	
}
void updateGameState(){
	object.update();
	
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
	object.draw(g);
}

void drawEndState(Graphics g){
	g.setFont(titlefont);
	g.setColor(Color.BLACK);
	g.drawString("Game Over", 75,200);
    g.setFont(font);
    g.drawString("Your score is x enemies", 75, 300);
}

GamePanel(){
	timer = new Timer(1000/60, this);
titlefont = new Font("Arial",Font.PLAIN,96);
font = new Font("Arial",Font.PLAIN,48);
snake = new SnakeObject(100, 100, 20, 20);
object = new ObjectManager(snake);
food = new Food(50,50,20,20);
ObjectManager object2;
object.addFood(food);
}
@Override
public void actionPerformed(ActionEvent e) {
	repaint();
	// TODO Auto-generated method stub
	  if(currentState == MENU_STATE){

          updateMenuState();

  }else if(currentState == GAME_STATE){

          updateGameState();

  }else if(currentState == END_STATE){

      updateEndState();
  }
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
		snake.up = true;
		snake.down = false;
		snake.right = false;
		snake.left = false;
	
		
	}
	if (b.getKeyCode() == KeyEvent.VK_DOWN) {
		snake.up = false;
		snake.down = true;
		snake.right = false;
		snake.left = false;
	}
	if (b.getKeyCode() == KeyEvent.VK_RIGHT) {
		snake.up = false;
		snake.down = false;
		snake.right = true;
		snake.left = false;
	}
	if (b.getKeyCode() == KeyEvent.VK_LEFT)
		
	{
		snake.up = false;
		snake.down = false;
		snake.right = false;
		snake.left = true;
	}

}	

@Override
public void keyReleased(KeyEvent c) {
	object.checkCollision();
}
@Override

public void paintComponent(Graphics g){
    if(currentState == MENU_STATE){
    	g.setColor(Color.BLACK);

    	g.fillRect(0, 0, Snake.width, Snake.height);   
        drawMenuState(g);

}else if(currentState == GAME_STATE){
	g.setColor(Color.GREEN);

	g.fillRect(0, 0, Snake.width, Snake.height);   
  
        drawGameState(g);

}else if(currentState == END_STATE){
	g.setColor(Color.RED);

	g.fillRect(0, 0, Snake.width, Snake.height);   
   
        drawEndState(g);

}


                

        }


}
