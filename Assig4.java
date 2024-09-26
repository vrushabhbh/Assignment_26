package Assigmnet1;
import java.util.*;
public class Assig4 {

	Scanner in = new Scanner(System.in);

	private int age;
	private boolean citizen;

	public void accept() {
		System.out.println("Enter Age ");
		age = in.nextInt();
		System.out.println("You are Indian Citizen (True/False)");
		citizen = in.nextBoolean();
	}

	public void checkEligibility() {
		if (citizen == true && age >= 18)
			System.out.println("You are Eligible for Voting");
		else
			System.out.println("You are not Eligible for Voting");
	}

	public static void main(String[] args) {
		
		Assig4 votingeligibility = new Assig4();
		votingeligibility.accept();
		votingeligibility.checkEligibility();
		
	}
}
