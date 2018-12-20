
public class Bank {
public static void main(String[] args) {
	Vault secure = new Vault();
	JamesBond hacker = new JamesBond();
	int code = hacker.findCode(secure);
boolean unlocked = secure.tryCode(code);
if(unlocked) {
	System.out.println("Access granted. The secret code is " + code + ".");
}
else {
	System.err.println("Access denied.");
}
}
}
