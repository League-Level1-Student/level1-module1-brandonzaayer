
public class Penquin {
int numOfFishEaten;
String name;
void dinner() {
	if (numOfFishEaten==0) {
		numOfFishEaten+=13;
		System.out.println("Good thing we still have food. Grandpa told me rations were running dry.");
		System.out.println(numOfFishEaten + " fish down the hatch.");
	}
	else {
		System.out.println("I have already had my rations for the day but a little more wouldn't hurt.");
		numOfFishEaten+=2;
		System.out.println(numOfFishEaten + " fish gone. Don't tell grandpa I've been eating his rations, his is on his death bed anyway.");
	}
}
 void name() {
	 System.out.println("Hello my nickname is " + name + ".");
 }
 Penquin(String name, int numOfFishEaten) {
     this.name = name;
     this.numOfFishEaten = numOfFishEaten;
}
}
