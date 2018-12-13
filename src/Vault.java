import java.util.Random;

public class Vault {
	Random r = new Random();
	int secretCode=r.nextInt(1000000);
	public static void main(String[] args) {
	Vault v=new Vault();
		v.tryCode();	
	}
	public void tryCode() {
		int i=0;
		i++;
		if(i==secretCode) {
			System.out.println("You cracked the code!");
		}
		else {
			System.out.println("That's not it.");
		}
	}
	

}
