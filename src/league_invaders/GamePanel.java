package league_invaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Font titleFont;
	Font font;
	Font endfont;
	Rocketship rocketship;
	Timer timer;
	ObjectManager object;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	

	void updateMenuState() {

	}

	void updateGameState() {
		System.out.println("y gamestate: " + rocketship.y);
		object.update();
        object.manageEnemies();
        object.purgeObjects();
        object.checkCollision();
        if(rocketship.isAlive == false){
        	currentState++;
        }
	}

	void updateEndState() {

	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("League Invaders", 40, 200);
		g.setFont(font);
		g.drawString("Press ENTER to start", 130, 350);
		g.drawString("Press SPACE for instructions", 105, 500);
	}

	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);

		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		object.draw(g);
	}

	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		g.setFont(endfont);
		g.setColor(Color.BLACK);
		g.drawString("Game Over", 110, 200);
		g.setFont(font);
		g.drawString("You killed x enemies", 130, 350);
		g.drawString("Press ENTER to restart", 105, 500);
		

	}

	public void paintComponent(Graphics g) {
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {

			drawGameState(g);

		} else if (currentState == END_STATE) {

			drawEndState(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		repaint();
		if (currentState == MENU_STATE) {

			updateMenuState();

		} else if (currentState == GAME_STATE) {

			updateGameState();

		} else if (currentState == END_STATE) {

			updateEndState();
		}

	}

	GamePanel() {
		timer = new Timer(1000 / 60, this);
		titleFont = new Font("Arial", Font.PLAIN, 60);
		font = new Font("Arial", Font.PLAIN, 24);
		endfont = new Font("Arial", Font.PLAIN, 50);
		rocketship = new Rocketship(250, 700, 50, 50);
		object = new ObjectManager(rocketship);
	}

	void StartGame() {
		timer.start();
	}

	public void keyTyped(KeyEvent a) {
		// TODO Auto-generated method stub
		if (a.getKeyChar() == KeyEvent.VK_ENTER) {
			currentState++;

			if (currentState > END_STATE) {

				currentState = MENU_STATE;
			}
		}

	}

	@Override
	public void keyPressed(KeyEvent b) {
		// TODO Auto-generated method stub

		if (b.getKeyCode() == KeyEvent.VK_UP) {
			rocketship.up = true;
		}
		if (b.getKeyCode() == KeyEvent.VK_DOWN) {
			rocketship.down = true;
		}
		if (b.getKeyCode() == KeyEvent.VK_RIGHT) {
			rocketship.right = true;
		}
		if (b.getKeyCode() == KeyEvent.VK_LEFT)
			
		{
			rocketship.left = true;
		}
		if(b.getKeyCode() == KeyEvent.VK_SPACE) {
			  object.addProjectile(new Projectile(rocketship.x+20, rocketship.y, 10, 10));
		}
	}

	@Override
	public void keyReleased(KeyEvent c) {
		// TODO Auto-generated method stub
		if (c.getKeyCode() == KeyEvent.VK_UP) {
			rocketship.up = false;
		}
		if (c.getKeyCode() == KeyEvent.VK_DOWN) {
			rocketship.down = false;
		}
		if (c.getKeyCode() == KeyEvent.VK_RIGHT) {
			rocketship.right = false;
		}
		if (c.getKeyCode() == KeyEvent.VK_LEFT)

		{
			rocketship.left = false;
		}
	}

}
