package cn.bdqn.pojo;

public class Flight_ticket {

	private int id;
	private int flightId;
	private int ticketPrice;
	private String sellCompany;
	public void setId(int id){
	this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setFlightId(int flightId){
	this.flightId=flightId;
	}
	public int getFlightId(){
		return flightId;
	}
	public void setTicketPrice(int ticketPrice){
	this.ticketPrice=ticketPrice;
	}
	public int getTicketPrice(){
		return ticketPrice;
	}
	public void setSellCompany(String sellCompany){
	this.sellCompany=sellCompany;
	}
	public String getSellCompany(){
		return sellCompany;
	}
}
