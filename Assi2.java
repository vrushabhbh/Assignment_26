package Assigmnet1;
import java.util.*;
public class Assi2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mark1, mark2, mark3;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the mark of the first subject out of 100");
		mark1 = sc.nextDouble();
		System.out.println("enter the marks of second subject out of 100");
		mark2 = sc.nextDouble();
		System.out.println("enter the marks of third subject out of 100");
		mark3 = sc.nextDouble();

		avg = (mark1 + mark2 + mark3) / 3;
		
	
          if(mark1>40 && mark2>40 && mark3>40 &&avg>=60) {
        	  System.out.println("The student is passed");
          }
          else {
        	  System.out.println("The student is failed");
          }
          System.out.println("The avrage of all marks is"+avg+"%");

}
}
