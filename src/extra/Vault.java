package extra;

public class Vault {
	int secretCode;
	public Vault(int secretCode2){
		secretCode= secretCode2;
	}

	boolean tryCode(int code) {
		if (code == secretCode) {
			return true;
		} else {
			return false;
		}
	}
}
