package league_invaders;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	Rocketship rocket;
	ArrayList<Projectile>hi = new ArrayList<>();
	ArrayList<Alien>aliens = new ArrayList<>();
	long enemyTimer = System.currentTimeMillis();
	int enemySpawnTime = 1000;
	
 int score = 0;
	public int getScore(){
		return score;
	}
ObjectManager(Rocketship rocketship){
	rocket = rocketship;	
}
void update(){
	rocket.update();
    for (int i = 0; i < hi.size(); i++) {
		Projectile array_element = hi.get(i);
		array_element.update();
	}
    for (int i = 0; i < aliens.size()-2; i++) {
		Alien array_element = aliens.get(i);
		array_element.update();
	}
}
void draw(Graphics g) {
	rocket.draw(g);
    for (int i = 0; i < hi.size(); i++) {
		Projectile array_element = hi.get(i);
		array_element.draw(g);
	}
    for (int i = 0; i < aliens.size(); i++) {
 		Alien array_element = aliens.get(i);
 		array_element.draw(g);
 	}
}

public void addProjectile(Projectile projectile) {
	hi.add(projectile);
	
}
public void addAlien(Alien alien) {
	aliens.add(alien);
	
}

public void manageEnemies(){
        if(System.currentTimeMillis() - enemyTimer >= enemySpawnTime){
        	System.out.println("hi");
                addAlien(new Alien(new Random().nextInt(LeagueInvaders.width), 0, 50, 50));

enemyTimer = System.currentTimeMillis();
        }
}
void purgeObjects() {
	for (int i = 0; i < aliens.size(); i++) {
		if(aliens.get(i).isAlive == false ) {
			score = getScore()+1;
			aliens.remove(i);
		}
	}

}
void checkCollision() {
	for(Alien a : aliens ){

        if(rocket.collisionBox.intersects(a.collisionBox)){

                rocket.isAlive = false;

        }
        for(Projectile p : hi)
if(p.collisionBox.intersects(a.collisionBox)) {
	a.isAlive = false;
}
	
}
}
public void addRocketship(Rocketship rocketship) {
	// TODO Auto-generated method stub
	rocket = rocketship;
}

}
