
/** Functions for checking if a given string is an anagram. */
public class Anagram {
	public static void main(String args[]) {
		// Tests the isAnagram function.
		// System.out.println(isAnagram("sileNt","listen"));  // true
		// System.out.println(isAnagram("William Shakespeare","H am a weakish speller")); // true
		// System.out.println(isAnagram("Madam Curie","Radium came")); // true
		// System.out.println(isAnagram("Tox Marvolo Riddle","I am lord Voldemort")); // true

		//System.out.println(isAnagram("silewt","listen"));

		// Tests the preProcess function.
		// System.out.println(preProcess("What? No way!!!"));
		// System.out.println(preProcess("BOOKS are GrEat FOR youR Heart- hoNEY!!!"));
	//	//System.out.println(charCounter("Tom Marvolo Riddle", 'x'));
		// Tests the randomAnagram function.
		// System.out.println("silent and " + randomAnagram("silent") + " are anagrams.");

		// Performs a stress test of randomAnagram 
		String str = "1234567";
		Boolean pass = true;
		//// 10 can be changed to much larger values, like 1000
		for (int i = 0; i < 10; i++) {
			String randomAnagram = randomAnagram(str);
			System.out.println(randomAnagram);
			pass = pass && isAnagram(str, randomAnagram);
			if (!pass) break;
		}
		System.out.println(pass ? "test passed" : "test Failed");

		//String s = args[0];
		//System.out.println("dental");
		// System.out.println(deleteChar(s, (int) (Math.random() * s.length())));
		//System.out.println((int) (Math.random() * s.length()));

	}  

	// Returns true if the two given strings are anagrams, false otherwise.
	public static boolean isAnagram(String str1, String str2) {
		str1 = preProcess(str1);
		str2 = preProcess(str2);

		if (str1.length() == str2.length()){
			
			for (int i = 0; i < str1.length(); i++){
		
				if (charCounter(str1, str1.charAt(i)) != charCounter(str2, str1.charAt(i))){ // charCounter: a function I built to count the number of times a char is shown in a string.
					return false;
				} 				
			}

		} else{
			return false;
		}
	
		return true;
	}
	   
	// Returns a preprocessed version of the given string: all the letter characters are converted
	// to lower-case, and all the other characters are deleted, except for spaces, which are left
	// as is. For example, the string "What? No way!" becomes "whatnoway"
	private static String preProcess(String str) {
		String newStr = "";
		for (int i = 0; i < str.length(); i++){
			 if (str.charAt(i) >= 65 && str.charAt(i) <= 90){
				newStr += (char)(str.charAt(i) + 32);
			 }
			 if (str.charAt(i) >= 97 && str.charAt(i) <= 122){
				newStr += str.charAt(i);
			 }
		}
		return newStr;
	} 
	   
	// Returns a random anagram of the given string. The random anagram consists of the same
	// characters as the given string, re-arranged in a random order. 
	public static String randomAnagram(String str) {
		str = preProcess(str);
		String newStr = "";
		int strLength = str.length();

		for (int i = 0; i < strLength; i++){
			int randomIndex = (int) (Math.random() * str.length());
			newStr += str.charAt(randomIndex);
			str = deleteChar(str, randomIndex); //deleteChar: a function I built to get a string without a specific char.
		}

		return newStr;
	}

	public static int charCounter(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++){
			if (str.charAt(i) == ch){
				count++;
			}
		}

		return count;
	}

	public static String deleteChar(String str, int index) {
		String newStr = "";
		for (int i = 0; i < str.length(); i++){
			if (i != index){
				newStr += str.charAt(i);
			}
		}
		return newStr;
	}
}


