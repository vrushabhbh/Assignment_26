package Assigmnet1;

import java.util.Scanner;

public class Assi5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean crimiRecor;
		boolean qualification;
		System.out.println("You are completed BE AND Greaguation (true or false)");
		crimiRecor = sc.nextBoolean();
		System.out.println("Tell us you have *CRIMINAL RECORD , (true or false)");
		qualification = sc.nextBoolean();
		if (crimiRecor == true && qualification == true) {
			System.out.println("You are eligible for the job  ! Congrats");
		} else {
			System.out.println(" You are not eligible");
		}

	}
}
