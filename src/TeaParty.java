
public class TeaParty {
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		if (isKnighted == false && isWoman == true) {
			return "Hello Ms. " + name + "";
		} else if (isKnighted == false && isWoman == false) {
			return "Hello Mr. " + name + "";
		} else if (isKnighted == true && isWoman == false) {
			return "Hello Sir " + name + "";
		} else if (isKnighted == true && isWoman == false) {
			return "Hello Lady " + name + "";
		}
		return name;

	}

}
