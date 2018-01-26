package cn.bdqn.pojo;

public class Airports {

	private int id;
	private String airportName;
	private String cityName;
	public void setId(int id){
	this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setAirportName(String airportName){
	this.airportName=airportName;
	}
	public String getAirportName(){
		return airportName;
	}
	public void setCityName(String cityName){
	this.cityName=cityName;
	}
	public String getCityName(){
		return cityName;
	}
}
