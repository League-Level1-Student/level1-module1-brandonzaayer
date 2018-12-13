import javax.swing.JOptionPane;

public class PopcornRunner {
public static void main(String[] args) {
	String flavor=JOptionPane.showInputDialog("What flavor would you like your popcorn to be flavored to?");
	Microwave Tidal=new Microwave();
	Popcorn Colonel=new Popcorn(flavor);
	Tidal.putInMicrowave(Colonel);
	String cookTime=JOptionPane.showInputDialog("How many minutes would you like your popcorn to be cooked?");
	int cookTimeInMinutes=Integer.parseInt(cookTime);
	Tidal.setTime(cookTimeInMinutes);
	Tidal.startMicrowave();
}
}
