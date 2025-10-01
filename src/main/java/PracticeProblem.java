public class PracticeProblem {

	public static void main(String args[]) {

	}

//Question 1
public static boolean validIndex(int[] array, int integer) {
	try {
		int test = array[integer];
		return (true); }
	catch (ArrayIndexOutOfBoundsException e) {
		return (false); }
	}
//Question 2
public static int divide(int integer1, int integer2) {
	try {
		return(integer1 / integer2);
	}
	catch (ArithmeticException e) { 
		return(0);
	}
}
//Question 3
public static int safeConvertStringtoInt(String string1) {
	try {
		return(Integer.parseInt(string1));
	}
	catch (NumberFormatException e) {
		return(0);
	}
}

}

