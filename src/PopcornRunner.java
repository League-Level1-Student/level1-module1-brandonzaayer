import javax.swing.JOptionPane;

public class PopcornRunner {
public static void main(String[] args) {
	String flavor=JOptionPane.showInputDialog("What flavor would you like your popcorn to be flavored to?");
	Microwave Tidal=new Microwave();
	Popcorn Colonel=new Popcorn(flavor);
	Microwave.putInMicrowave(Colonel);
}
}
