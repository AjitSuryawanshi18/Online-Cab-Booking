package Ola_Cab_Booking;
import java.util.*;
public class Ola {

	Cab C;
	
	public void bookCab(Cab C) {
		if(this.C !=null) {
			System.out.println(" Cab is Already Booked...");
		}else {
			this.C=C;
			System.out.println("Cab is Booked Successfully...");
		}
	}
	
	public void cancelCab() {
		if(this.C!=null) {
			Scanner sc = new Scanner (System.in);
			System.out.println("You Sure Want to Cancel PLease Confirm [Yes/No] ? After cant be Undone...!");
			String ans=sc.next();
			if(ans.equalsIgnoreCase("yes")) {
			this.C=null;
			System.out.println("Cab Cancelled Successfully...");
			}else {
				System.out.println("Good Choice Your Cab not Cancelled YOu CAn Travell Now...!");
			}
		}else {
			System.out.println(" You Dont have any booking for cancellation...!Please Book Cab First...\n");
		}
	}
	
	public void updateCab() {
		if(this.C!=null) {
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter Your new Pick up Point ");
			String pickup = sc.next();
			C.setPickup(pickup);
			System.out.println("Enter Your new Destination Point ");
			String dest = sc.next();
			C.setDestination(dest);
			System.out.println("Enter Your new Contact number ");
			String newcontact = sc.next();
			C.setCustNo(newcontact);
			System.out.println(" Cab Details Updated Successfully.....");
		}else {
			System.out.println(" You Dont have any booking ...!Please Book Cab First .....");
		}
	}
	
	public void displayDetails() {
	if(this.C!=null) {
		    System.out.println("------------------------------------------------------");
		    System.out.println("Your booking Are as follows : \n");
			System.out.println(" Cab Color Is : " +C.getColor()+"\n");
			System.out.println("Customer contact number Is : " +C.getCustNo()+"\n");
			System.out.println("Customer Name Is : " +C.getName()+"\n");
			System.out.println("Your Cab Have "+ C.getNoOfSeat()+ " Number of Seats "+"\n");
			System.out.println("Your Pickup Point Is : " +C.getPickup()+"\n");
			System.out.println("Your Destination Is : " +C.getDestination()+"\n");
			System.out.println("------------------------------------------------------");
	}else {
		System.out.println(" You Dont have any booking ...!Please book Cab First Without That We Cant Able To Display Anything...... ");
	}
  }
	
	public void myOtpPassword() {
		if(this.C!=null) {
			Random otp=new Random();
			long otppass =otp.nextLong(100000);
			System.out.println("Your OTP Password is..."+otppass);
			
			System.out.println("PLease do Share this password only with Verified Ola Cab Driver...!");
			System.out.println("We Wish You a Enjoyable &Safe Journey ...HAve a funn...!");
			System.out.println("if any issue arise feel free to share with us we will sure help you ...!\n");
			
		}else {
			System.out.println(" You Dont have any booking ...!Please book Cab First Without That We Cant Able To create Otp Password......! ");
		}
		
	}
}
