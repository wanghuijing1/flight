package cn.bdqn.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bdqn.pojo.Flight_ticket;
import cn.bdqn.pojo.Flights;

public interface FlightsMapper {

	//通过时间查询航班
	List<Flights> getSelectFlights(@Param("time")Date time,@Param("takeoffAirportName")String takeoffAirportName,@Param("landingAirportName")String landingAirportName);
	//通过id获取起飞降落时的机场
	String getSelectAirports(int id);
	//通过机场id获取机场代购
	List<Flight_ticket> getSelectAirportsTicket(int flightId);
}
