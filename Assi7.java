package Assigmnet1;

import java.util.Scanner;

class A {
	private int temp;
	boolean rain;

	public

			void get() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entere the todays temperature");
		temp = sc.nextInt();
		System.out.println("Enter wheter raining or not (true/false)");
		rain = sc.nextBoolean();

	}

	void show() {
		if (!(temp > 20 && temp < 30 && rain == true)) {
			System.out.println("Temperature is normal go outside . *Sky is clear");

		} else {
			{
				System.out.println("Temperature is bad dont go outside. Aslo its raining outside");
			}
		}
	}

}

public class Assi7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		obj.get();
		obj.show();
	}

}
