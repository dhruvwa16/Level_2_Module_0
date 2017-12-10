package intro_to_array_lists;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
public static void main(String[] args) {
	new GuestBook().createUI();
}
	
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
JFrame frame= new JFrame();
JPanel panel= new JPanel();
JButton button1 = new JButton();
JButton button2 = new JButton();
ArrayList<String>hi = new ArrayList<>();

	private void createUI() {
	// TODO Auto-generated method stub
	frame.add(panel);
	frame.setVisible(true);
	button1.setText("Add Name");
	button2.setText("View Names");
	panel.add(button1);
	panel.add(button2);
	button1.addActionListener(this);
	button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button1){
			String a = JOptionPane.showInputDialog("Enter a name");
		}
		if(e.getSource() == button2){
			
	}

	}
}
	
	
	
	
	
	
	
	
	
	
	
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

