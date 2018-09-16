
public class PalindromeDemo {

	public static void main(String[] args) {
		String str = "MALAYALAM";
		int startIndex = 0;
		int endIndex = str.length() - 1;
		System.out.println(endIndex);
		boolean flag = true;
		for (int i = 0; i < endIndex / 2; i++) {
			if (str.charAt(startIndex++) != (str.charAt(endIndex--))) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Is a palindrome");
		} else {
			System.out.println("Is not a palindrome");
		}

	}

}
