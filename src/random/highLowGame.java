package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class highLowGame {
	public static void main(String[] args) {
		
	
	
Random randGen = new Random();
int r = randGen.nextInt(25-0+1)+0;
String answer = JOptionPane.showInputDialog("Pick a number from 0-25");
int anS = Integer.parseInt(answer);
for (int i = 0; i < 100; i++) {

	if(anS == r){
JOptionPane.showMessageDialog(null,"Congratulations! You have guessed the correct answer");
}
else {
	
}	
}
}
}

