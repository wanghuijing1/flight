package cn.bdqn.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.bdqn.dao.FlightsMapper;
import cn.bdqn.pojo.Flight_ticket;
import cn.bdqn.pojo.Flights;
import cn.bdqn.service.FlightsService;

@Service
public class FlightsServiceImpl implements FlightsService{

	@Resource
	private FlightsMapper dao;

	@Override
	public List<Flights> select(Date time, String takeoff, String landing) {
		List<Flights> f=null;
		System.out.println("time========>"+time);
		System.out.println("takeoff========>"+takeoff);
		System.out.println("landing========>"+landing);
		f = dao.getSelectFlights(time,takeoff,landing);
		for (int i = 0; i < f.size(); i++) {
			f.get(i).setLandingAirportName(dao.getSelectAirports(f.get(i).getLandingAirportId()));
			f.get(i).setTakeoffAirportName(dao.getSelectAirports(f.get(i).getTakeoffAirportId()));
		}
		return f;
	}

	@Override
	public List<Flight_ticket> select2(int flightId) {
		List<Flight_ticket> list=null;
		System.out.println("进入异步查询============================>");
		list=dao.getSelectAirportsTicket(flightId);
		return list;
	}
	
}
