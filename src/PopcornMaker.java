import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		String flavor= JOptionPane.showInputDialog("What flavor popcorn would you like?");
		String time=JOptionPane.showInputDialog("How many minutes do you want to cook the popcorn?");
		int minutes=Integer.parseInt(time);
		Microwave microwave = new Microwave();
		Popcorn popcorn = new Popcorn(flavor);
		microwave.putInMicrowave(popcorn);
		microwave.setTime(minutes);
		microwave.startMicrowave();
	}
}
