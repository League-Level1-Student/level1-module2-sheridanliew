package extra;

public class JamesBond {
	Vault vault = new Vault();

	public int findCode(Vault vault) {
		for (int i = 0; i < 1000001; i++) {
			boolean test = vault.tryCode(i);
			if (test) {
				return i;
			}
		}
		return -1;
	}
}
