package Ola_Cab_Booking;
import java.util.*;
public class Cab {

	//Attributes 
	private String Color;
	private String CustNo;
	private String Name;
	private String Pickup;
	private String Destination;
	private String NoOfSeat;
	private String CabCompany;
	public Cab(String color ,String custNo, String Name, String pickup, String destination, String noOfSeat) {
		
		this.Color = color;
		this.CustNo = custNo;
		this.Name = Name;
		this.Pickup = pickup;
		this.Destination = destination;
		this.NoOfSeat = noOfSeat;
	}
	// getters and setters
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	
	public String getCustNo() {
		return CustNo;
	}
	public void setCustNo(String custNo) {
		CustNo = custNo;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		Name = Name;
	}
	public String getPickup() {
		return Pickup;
	}
	public void setPickup(String pickup) {
		Pickup = pickup;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public String getNoOfSeat() {
		return NoOfSeat;
	}
	public void setNoOfSeat(String noOfSeat) {
		NoOfSeat = noOfSeat;
	}
	

	
	
}
