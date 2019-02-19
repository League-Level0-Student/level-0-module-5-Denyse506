package extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
Robot name= new Robot();
		//2. Set the speed to 100
name.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "Pick what color you want", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red 0","Blue 1", "Yellow 2"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(colorChoice==0) {
		name.setPenColor(0,0,255);
		}
		else if(colorChoice==1) {
		name.setPenColor(255,0,0);
		}
		else if(colorChoice==2) {
		name.setPenColor(255,255,0);
		}
		name.penDown();
		//4. Ask the use how many polygons they want to be drawn.
		String shape=JOptionPane.showInputDialog(null,"how many  polygons do you want to draw");
		int am=Integer.parseInt(shape) ;
		for (int i = 0; i < am; i++) {
			name.moveTo(i*100, i*59);
			name.move(100);
			name.turn(90);
			name.move(100);
			name.turn(90);
			name.move(100);
			name.turn(90);
			name.move(100);
			name.turn(90);
			
		}
		//5. Use the robot to draw the number of polygons the user requested.
		
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

