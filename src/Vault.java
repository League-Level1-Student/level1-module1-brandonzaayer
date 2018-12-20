import java.util.Random;

public class Vault {
	private int secretCode;
	Vault(){
	Random r = new Random();;
	 secretCode=r.nextInt(Integer.MAX_VALUE);
	}
boolean tryCode(int guess) {
	if(secretCode==guess) {
		return true;
	}
	else {
		return false;
}
}
}