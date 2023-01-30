package Ola_Cab_Booking;
import java.util.*;
public class Cab_Ola_Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        boolean exit = true;
        Ola O1=new Ola();
        
        while(exit) {
        	System.out.println("Enter Your Choice :\n 1.Book Cab :\n 2.Cancel Cab :\n 3.Update Cab Ola Details :\n"
        			+ " 4.Show Details of Your Cab Booking :\n 5.myOtpPassword :\n 6.Exit");
        	int Choice =sc.nextInt();
        	
        	switch(Choice) {
        	
        	case 1 :
        	{
        		System.out.println(" Enter Your All The Details :\n ");
        		System.out.println(" Enter Your desired Cab Color :");
        		String color = sc.next();
        		System.out.println(" Enter Your contact Number :");
        		String custno = sc.next();
        		System.out.println(" Enter Your Name :");
        		String passengername = sc.next();
        		System.out.println(" Enter Your Pick Up Point :");
        		String pickup = sc.next();
        		System.out.println(" Enter Your Destination :");
        		String dest = sc.next();
        		System.out.println(" Enter Your Cab Number Of Seats :");
        		String numberofseats = sc.next();
        	
        		O1.bookCab(new Cab(color,custno,passengername,pickup,dest,numberofseats));
        	}
        	break;
        	case 2 :
        	{
        		O1.cancelCab();
        	}
        	break;
        	case 3 :
        	{
        		O1.updateCab();
        	}
        	break;
        	case 4 :
        	{
        		O1.displayDetails();
        	}
        	break;
        	case 5 :{
        		O1.myOtpPassword();
        	}
        	break;
        	case 6 :
        	{
        		exit=false;
        	}
        	break;
        	default :
        	{
        		System.out.println(" -----Invalid Choice-----Plz Try Again-----");
        	}
        	}
        }
	}

}
