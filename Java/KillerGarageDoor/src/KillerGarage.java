//https://www.codewars.com/kata/killer-garage-door/train/java
public class KillerGarage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Convert string to char array
	// 0 fully closed
	// 5 fully opened
	// . nothing
	// P Button is pressed - if no previous P -> Open
	// if Other P > close
	// O -> obstacle detected -  reverse counting;
	// if less than 1 -> zeros
	// if higher than 5 -> zeroes
	
	/*
	 * char[] arr = string.toCharArray();
	 * iterate through the array
	 * set a counter that is equal to the array length
	 * char previous = char[i - 1];
	 * char next = char[i + 1]
	 * char current = char[i]
	 * StringBuilder output = new StringBuilder()
	 * 
	 * if string start with . do nothing -> print 0
	 * if next string is . do nothing -> print 0
	 * if next string is . do nothing -> print 0
	 * if next string is P print 1
	 * if next string is . print 2
	 * if next string is . print 3
	 * if next string is . print 4
	 * if next string is . print 5
	 * if next string is . print 0
	 * if next string is . print 0
	 * if next string is P print 4
	 * if next string is . print 3
	 * if next string is . print 2
	 * if next string is P print 2
	 * if next string is . print 2
	 * if next string is . print 2
	 * if next string is P print 1
	 * if next string is . print 0
	 * if next string is . print 0
	 * if next string is P print 1
	 * if next string is . print 2
	 * if next string is . print 3
	 * if next string is O print 2
	 * if next string is . print 1
	 * if next string is . print 0
	 * 
	 * if door is closed P starts opening the door -> prints 1 to 5
	 * if door is opened P starts closing the door -> prints 5 to 1
	 * when door detects obstacle O it reverses the direction.
	 * . does nothing
	 * 
	 * 
	 * by default door is close
	 * I need a variable that monitors the door direction -> Open or close
	 * I need a variable for obstacle. by defautl it will be false. boolean isObstacle = false;
	 * I need a method that does the countdown or count up depending on the door position
	 * I need to check the next char and decide what to do based on the value
	 * 
	 * isDoorOpen = false
	 * isDoorPaused = false;
	 * isObstacle = false;
	 * int current count = 0;
	 * 
	 * for (int i =0; i < charArray.lenght; i ++) 
	 * 	if door is closed
	 * 			check current character
	 * 			if character is . 
	 * 				do nothing - print 0
	 * 			else if character is P
	 * 					change isDoor open to true;
	 * 					if current count + 1 < 5
	 * 						increment the current count - invoke method
	 * 					else
	 * 						print 0
	 * 			else if character is O
	 * 				check current count
	 * 				 if current count 0 
	 * 					do nothing
	 * 					print 0
	 * 				else 
	 * 					invoke current count method with obstacle == true;
	 * 					print count with obstacle == true -- count - 1;
	 *	else if door open
	 * 			if character is . 
	 * 				if the door is paused 
	 * 					print current count
	 * 				else if the door is not paused
	 * 					if (current count + 1 < 5)
	 * 						print current count + 1
	 * 					else
	 * 						print 0
	 * 			else if character is P
	 * 				if the door is paused
	 * 					isDoorPaused = false;
	 * 					if current count + 1 < 5
	 * 						current count + 1
	 * 					else
	 * 						return 0
	 * 				else // if the door is not paused , but it is open
	 * 					isDoorPause = true;
	 * 					print current count;
	 * 			else if character is O
	 *				check current count
	 * 				 if current count 0 
	 * 					do nothing
	 * 					print 0
	 * 				else 
	 * 					invoke current count method with obstacle == true;
	 * 					print count with obstacle == true -- count - 1;
	 * 
	 * 
	 *   public int currentCountIncrement(int count, boolean obstacle) {
	 *   	if (obstacle) {
	 *   		return count - 1;
	 *   	}
	 *   	else {
	 *   		return count + 1;
	 *   	}
	 *   
	 *   } 
	 * 
	 * 
	 */
}
