package extra;

public class VaultRunner {
	public static void main(String[] args) {
		Vault vault = new Vault();
		vault.tryCode(0);
		JamesBond james= new JamesBond();
		System.out.println(james.findCode(vault));
	}
}
