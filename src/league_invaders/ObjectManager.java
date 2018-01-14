package league_invaders;

import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {
	Rocketship rocket;
	ArrayList<Projectile>hi = new ArrayList<>();
ObjectManager(Rocketship rocketship){
	rocket = rocketship;
	
}
void update(){
	rocket.update();
    for (int i = 0; i < hi.size(); i++) {
		Projectile array_element = hi.get(i);
		array_element.update();
	}
}
void draw(Graphics g) {
	rocket.draw(g);
}
void addProjectile(ArrayList<Projectile>hi) {
	
}
}
