// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(0,5));   // 2 + 3
		System.out.println(minus(-5,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(0,-22));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(3,0));      // 5^3
   		System.out.println(pow(4,1));      // 3^5
   		System.out.println(div(16, 2));   // 12 / 3    
   		System.out.println(div(-44 ,1));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(-25,8));   // 25 % 7
   		System.out.println(mod(22,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
		System.out.println(Math.sqrt(12));
		System.out.println("5/7 prints " + 5/7 + " and in our case " + div(5, 7));
		System.out.println("7/5 prints " + 7/5 + " and in our case " + div(7, 5));
		System.out.println("-5/7 prints " + -5/7 + " and in our case " + div(-5, 7));
		System.out.println("5/-7 prints " + 5/-7 + " and in our case " + div(5, -7));
		System.out.println("-7/5 prints " + -7/5 + " and in our case " + div(-7, 5));
		System.out.println("7/-5 prints " + 7/-5 + " and in our case " + div(7, -5));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		if (x2 > 0){
			for (int i = 0; i < x2; i++){
				x1++;
			}
		} else{
			for (int i = 0; i < -x2 ; i++){
				x1--;
			}
		}

		return x1;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		if (x2 > 0){
			for (int i = 0; i < x2; i++){
				x1--;
			}
		} else{
			for (int i = 0; i < -x2 ; i++){
				x1++;
			}
		}

		return x1;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		int result = 0;
		if (x2 > 0){
			for (int i = 0; i < x2; i++){
				result = plus(result,x1);
			}
		} else{
			for (int i = 0; i < -x2; i++){
				result = minus(result,x1);
			}
		}

		return result;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		int result = 1;
		if (n > 0){
			for (int i = 0; i < n; i++){
				result = times(result,x);
			}
		} else if (n == 0){
			result = 1;
		} 

		return result;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		int counter = 0;
		int negative = 1;

		if (x1 < 0){
			x1 = times(x1, -1); 
			negative = times(negative, -1);
		}

		if (x2 < 0){
			x2 = times(x2, -1); 
			negative = times(negative, -1);
		}

		while (x1 >= x2){
			x1 = minus(x1, x2);
			counter++;
		}

		return times(counter, negative);

	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
        int r = x1 % x2;
		return r;
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
        // Replace the following statement with your code
		return 0;
	}	  	  
}