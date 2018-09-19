package extra;

import javax.swing.JOptionPane;

public class VaultRunner {
	public static void main(String[] args) {
		Vault vault = new Vault();
		JamesBond james = new JamesBond();
		int code = james.findCode(vault);
		if (code == vault.secretCode) {
			JOptionPane.showMessageDialog(null, "James Bond cracked the code! The code was "+code+".");
		} else {
			JOptionPane.showMessageDialog(null, "James Bond could not crack the code...");
		}
	}
}
