package cn.bdqn.service;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bdqn.pojo.Flight_ticket;
import cn.bdqn.pojo.Flights;

public interface FlightsService {

	List<Flights> select(@Param("time")Date time,@Param("takeoff")String takeoff,@Param("landing")String landing);
	List<Flight_ticket> select2(int flightId);
}
