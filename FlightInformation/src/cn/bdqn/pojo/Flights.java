package cn.bdqn.pojo;

import java.util.Date;

import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Flights extends Airports{

	private int id;
	private String flightCode;
	@Past(message="ÃÜÂë²»ÄÜÎª¿Õ")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JSONField(format="yyyy-MM-dd")
	private Date flightDate;
	private String airline;
	private String type;
	private int takeoffAirportId;
	private int landingAirportId;
	private String takeoffAirportName;
	private String landingAirportName;
	public String getTakeoffAirportName() {
		return takeoffAirportName;
	}
	public void setTakeoffAirportName(String takeoffAirportName) {
		this.takeoffAirportName = takeoffAirportName;
	}
	public String getLandingAirportName() {
		return landingAirportName;
	}
	public void setLandingAirportName(String landingAirportName) {
		this.landingAirportName = landingAirportName;
	}
	private Date takeoffTime;
	private Date landingTime;
	private String flightTime;
	private String stopAirport;
	private int referencePrice;
	public void setId(int id){
	this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setFlightCode(String flightCode){
	this.flightCode=flightCode;
	}
	public String getFlightCode(){
		return flightCode;
	}
	public void setFlightDate(Date flightDate){
	this.flightDate=flightDate;
	}
	public Date getFlightDate(){
		return flightDate;
	}
	public void setAirline(String airline){
	this.airline=airline;
	}
	public String getAirline(){
		return airline;
	}
	public void setType(String type){
	this.type=type;
	}
	public String getType(){
		return type;
	}
	public void setTakeoffAirportId(int takeoffAirportId){
	this.takeoffAirportId=takeoffAirportId;
	}
	public int getTakeoffAirportId(){
		return takeoffAirportId;
	}
	public void setLandingAirportId(int landingAirportId){
	this.landingAirportId=landingAirportId;
	}
	public int getLandingAirportId(){
		return landingAirportId;
	}
	public void setTakeoffTime(Date takeoffTime){
	this.takeoffTime=takeoffTime;
	}
	public Date getTakeoffTime(){
		return takeoffTime;
	}
	public void setLandingTime(Date landingTime){
	this.landingTime=landingTime;
	}
	public Date getLandingTime(){
		return landingTime;
	}
	public void setFlightTime(String flightTime){
	this.flightTime=flightTime;
	}
	public String getFlightTime(){
		return flightTime;
	}
	public void setStopAirport(String stopAirport){
	this.stopAirport=stopAirport;
	}
	public String getStopAirport(){
		return stopAirport;
	}
	public void setReferencePrice(int referencePrice){
	this.referencePrice=referencePrice;
	}
	public int getReferencePrice(){
		return referencePrice;
	}
}
