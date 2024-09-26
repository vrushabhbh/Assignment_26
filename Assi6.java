package Assigmnet1;

import java.util.Scanner;


class b{
	 private int num;
	 void get() {
		 System.out.println("enter the numbr ");
		 Scanner sc=new Scanner(System.in);
		 num=sc.nextInt();
	 }
	void show() {
		
	 if(!(num>10 && num<20) ){
			 System.out.println("the number not between 10 and 20");
		 }else {
			 System.out.println("the number is  under 10 and 20");
		 }
	 }

	 
}
public class Assi6{
	public static void main(String []arg) {
		b obj=new b();
		obj.get();
		obj.show();
		
	}

}