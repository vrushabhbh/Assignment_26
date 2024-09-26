package Assigmnet1;
import java.util.*;
public class Assi3 {

	public static void main(String[] args) {
		int userId,accesCard,admin;
			Scanner SC=new Scanner(System.in); 
	       System.out.println("Enter the Valid User ID for Access");
	       userId=SC.nextInt();
	       System.out.println("Enter the valid  access For access");
	       accesCard=SC.nextInt();
	       System.out.println("Enter the admin key");
	       admin=SC.nextInt();
	       	if(userId==1111 && accesCard==2222 ||admin==0000) {
	       		System.out.println("You are granted sucessfully! ");
	       		
	       	}else {
	       		System.out.println("You are not granted ! Sorry");
	       	}
			
		

		}
	}


