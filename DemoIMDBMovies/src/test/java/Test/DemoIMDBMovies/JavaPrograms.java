package Test.DemoIMDBMovies;
import java.util.Scanner;
import org.testng.annotations.Test;

public class JavaPrograms {

	
	public void CheckPalindromicNumber() {
	int num, TestNo, sum=0;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number that needs to be checked.");
	num = s.nextInt();
	System.out.println("Number entered is "+num);
	TestNo = num;
	while(TestNo>0)
	{
	sum = (sum*10)+ TestNo%10;
	TestNo = TestNo/10;
	}
	System.out.println("Reversed number is "+sum);
	if (sum == num)
	System.out.println("Entered number is Palindrome");
	else
	System.out.println("Entered number not Palindrome");
	s.close();
	}
	
	public void CheckPalindromicString() {
	String original, reverse = "";
	System.out.println("Enter the string and press ENTER.");
	Scanner s = new Scanner(System.in);
	original = s.nextLine();
	System.out.println("String supplied is:"+original);
	System.out.println("Reverse string is:"+reverse);

	int length = original.length();
	for(int i=length-1; i>=0; i--)
	{
	reverse = reverse + original.charAt(i);
	}
	System.out.println("Resulted string is:"+reverse);
	if(original.equalsIgnoreCase(reverse))
	System.out.println("Supplied string is Palindrome.");
	else
	System.out.println("Supplied string is not Palindrome.");
	s.close();
	}
	
	public void ReverseString() {

	System.out.println("Enter the string you want to reverse:");
	Scanner s = new Scanner(System.in);
	String original = s.nextLine();
	System.out.println("Supplied string is: "+original);
	String reverse = "";
	int length = original.length();
	for(int i=length-1; i>=0; i--) {
	reverse = reverse + original.charAt(i);
	}
	System.out.println("Reversed string is: "+reverse);
	}

	public void PrintFibonacci() {
	int a=0, b=0, c=1;
	System.out.println("Enter the number for Fibonacci series.");
	Scanner s = new Scanner(System.in);
	int length = s.nextInt();
	for(int i=1; i<=length; i++)

	{
	a=b;
	b=c;
	c=a+b;
	System.out.print(a+" ");
	}
	System.out.println("");
	}
	public void CheckPrime() {
	int temp;
	boolean isPrime = true;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter any number: ");
	int num = s.nextInt();
	s.close();
	for (int i=2; i<=num/2; i++)
	{
	temp = num%i;
	if(temp==0)
	{
	isPrime = false;
	break;
	}
	}
	if(isPrime)
	System.out.println(num+ " is a Prime Number.");
	else
	System.out.println(num+ " is NOT a Prime number");

	}
}
