package calci;
import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {

    	float NUM1, NUM2;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your choice\n");
        System.out.println("Enter 1 for ADDITION \nEnter 2 for SUBTRUCTION \nEnter 3 for MULTIPLICATION \nEnter 4 for DIVISION\n");
        int choice = scan.nextInt();
        float RESULT;
        System.out.println("ENTER THE FIRST NUMBER\n");
    	NUM1 = scan.nextFloat();
    	System.out.println("ENTER THE SECOND NUMBER\n");
    	NUM2 = scan.nextFloat();
        switch(choice)
        {
            case 1:
            	
            	System.out.println("TWO NUMBERS ARE ADDED\n");
            	RESULT = NUM1 + NUM2;
            	System.out.println("ADDITION="+RESULT);
                break;

            case 2:
     
            	System.out.println("TWO NUMBERS ARE SUBTRUCTED\n");
            	RESULT = NUM1 - NUM2;
            	System.out.println("SUBTRUCTION="+RESULT);
                break;

            case 3:
            	
            	System.out.println("TWO NUMBERS ARE MULTIPLIED\n");
            	RESULT = NUM1 * NUM2;
            	System.out.println("MULTIPLICATION="+RESULT);
            	break;

            case 4:
            	
            	System.out.println("TWO NUMBERS ARE DIVIDED\n");
            	RESULT = NUM1 / NUM2;
            	System.out.println("DIVISION="+RESULT);
            	break;

            default:
                System.out.printf("wrong choice has been given");
                return;
               
        }
    }
}

