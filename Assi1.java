package Assigmnet1;
import java.util.*;
public class Assi1 {
	public static void main(String[] arg) {
		int age;
		int salary;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name ");
		name = sc.next();

		System.out.println("enter the age");
		age = sc.nextInt();
		System.out.println("enter the salary");
		salary = sc.nextInt();
               if(age>18 &&age<=60 && salary>25000) {
            	   System.out.println(name+" are eligible for the loan");
               }else {
            	   System.out.println(name+" you  are not eligible for the loan");
               }
	}

}
