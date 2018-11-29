

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar Best=new RaceCar("HotWheels", 5);
		// 2. Print the RaceCar's position in the race
 int position=Best.getPositionInRace();
 
 System.out.println("Your car is currently number "+position+" in the race.");

		// 3. Crash the RaceCar
		Best.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
if(Best.damaged==true) {
	Best.pit();
}
		// 5. Help the car move into first place.
System.out.println("Your newly repaired car is zooming past the others.");

while(Best.getPositionInRace()>1) {
	Best.overtake();
	
}
if(Best.getPositionInRace()==1) {
	System.out.println("You win!");
}

	}
}
