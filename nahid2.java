package lab11;

import java.util.Scanner;

public class nahid2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your marks:");
		double mark = scan.nextDouble();
		if(mark >= 90){
		System.out.println("Excellent: Grade A");
		}
		else if(mark < 90 && mark >= 80)
		{
		System.out.println("Very Good: Grade B");
		}
		else if(mark < 80 && mark>= 70)
		{
		System.out.println("Good: Grade C");
		}
		else if(mark < 70 && mark >= 60)
		{
		System.out.println("Satisfactory: Grade D");
		}
		else if(mark < 60 && mark >= 50)
		{
		System.out.println("Work Hard: Grade E");
		}
		else if(mark < 50 && mark >= 40)
		{
		System.out.println("Just Passed: Grade F");
		}
		else
		{
		System.out.println("Failed!");
		}
		}
		}