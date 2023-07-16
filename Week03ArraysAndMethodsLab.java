package week03;

public class Week03ArraysAndMethodsLab {
	public static void main(String[] args) {
		
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] valuesArray = {1, 5, 2, 8, 13, 6};
		double[] valuesArray2 = {1, 5, 2, 8, 13, 6};
		// 2. Print out the first element in the array
		System.out.println("Prompt 2");
		System.out.println(valuesArray[0]);
		
		// 3. Print out the last element in the array without using the number 5
		int i = 0;
		do {
			i++;
		} while (i < 4); 
		System.out.println("Prompt 3");	
		System.out.println(valuesArray[i]);
		System.out.println(valuesArray[valuesArray.length - 1]);
		 
		// 4. Print out the element in the array at position 6, what happens?
	//	System.out.println(valuesArray[6]);	
		
		// 5. Print out the element in the array at position -1, what happens?
	//	System.out.println(valuesArray[-1]);
			
		// 6. Write a traditional for loop that prints out each element in the array
		System.out.println("Prompt 6");	
		i = 0;
			do {
				i++;
				System.out.println(valuesArray[i]);
			} while (i < 5); 
						
		// 7. Write an enhanced for loop that prints out each element in the array
		System.out.println("Prompt 7");
			for (int i2 : valuesArray) {
			System.out.println(i2);
		}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		System.out.println("Prompt 8");
			int sum = 0;
		for (int num : valuesArray) {
			sum += num;
			System.out.println(sum);
		} 
			
		// 9. Create a new variable called average and assign the average value of the array to it
		System.out.println("Prompt 9");
		int average = sum / valuesArray.length;
		System.out.println(average);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		for (int i3 : valuesArray) {
			if (i3 % 2 != 0) {
				System.out.println(i3);
			}
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] namesArray = {"Sam", "Sally", "Thomas", "Robert"};
		
		// 12. Calculate the sum of all the letters in the new array
		System.out.println("Prompt 12");
		int nameSum = 0;
		for (String name : namesArray) {
			nameSum += name.length();
		}
		System.out.println(nameSum);
		
	

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		System.out.println("Prompt 13");
		greetPrint("Sam");

		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		System.out.println("Prompt 14");
		System.out.println(greetReturn("Sammy"));
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		// Both methods can lead to the same result, a return method can hold the value for later/other uses.
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		System.out.println("Prompt 15");
		System.out.println(greaterThanInt(namesArray[0], valuesArray[0])) ;
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		System.out.println("Prompt 16");
		String test = "Jack";
		
		System.out.println(trueName(namesArray[0], test));
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		System.out.println("Prompt 17");				
		System.out.println(smallestNum(valuesArray));
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		System.out.println("Prompt 18");
		System.out.println(daAverage(valuesArray2));
		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		System.out.println("Prompt 19");
		int[] nameLengths = wordNum(namesArray);
		for (int numW : nameLengths) {
				System.out.println(numW);
		}
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		System.out.println("Prompt 20");
		System.out.println(evenOrOdd(namesArray));
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		System.out.println("Prompt 21");
		System.out.println(palindrome("racecar "));
	}
			
	// Method 13:
	public static void greetPrint(String name) {
		System.out.println("Hello " + name + "!");
		}
	

	// Method 14:
	public static String greetReturn(String name) {
		return ("Hello " + name + "!");
		}
		
	// Method 15:
	public static boolean greaterThanInt(String x, int y) {
		return(y < x.length());

		
	}
	
	// Method 16:
	public static boolean trueName(String array, String random) {
		return(random == array);
	}
	
	// Method 17:
	public static int smallestNum(int[] numbers) {
		int smallest = numbers[0];
		for (int number : numbers) {
			if (number < smallest) {
				smallest = number;
			}
		}
	return smallest;
	}
	
	// Method 18:
	public static double daAverage(double[] a) {
		double i4 = 0;
		for (double i5 : a) {
		i4 += i5;
		} 
		return(i4 / a.length);
	}	
			
	// Method 19:
//	public static int wordNum(String words[]) {
//		 int numWords[] = {words.length};
//		 System.out.println(numWords);
//	}
	public static int[] wordNum(String[] words) {
		int[] numWords = new int[words.length];
		for (int i7 = 0; i7 < words.length; i7++) {
			numWords[i7] = words[i7].length();
		}
		return numWords;
	}

	// Method 20:
	public static boolean evenOrOdd(String words2[]) {
	int	nameSumOdd = 0;
	int	nameSumEven = 0;
		for (String words3 : words2) {
			if (words3.length() % 2 == 0) {
				nameSumEven += words3.length();
			} else { 
				nameSumOdd += words3.length();
				}
		}
	return (nameSumEven > nameSumOdd);
	}
	
	// Method 21:
	public static boolean palindrome(String string) {
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}

