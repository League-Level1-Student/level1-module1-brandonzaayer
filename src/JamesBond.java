
public class JamesBond{
	int findCode(Vault secure){
		int i =0;
		while(secure.tryCode(i)== false) {
		i++;	
		System.out.println(i);
		}
		return i;
}
}