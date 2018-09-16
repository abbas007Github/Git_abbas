import java.util.Scanner;

public class ReversingNumber {

	public static void main(String[] args) {
		int reverseNumber=0;
		System.out.println("Enter the number to reverse");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
		while(num!=0)
		{
			reverseNumber =reverseNumber*10;
			reverseNumber=reverseNumber+num%10;
			num=num/10;
		}
		System.out.println("Reversed Number is "+reverseNumber);
	}

}
