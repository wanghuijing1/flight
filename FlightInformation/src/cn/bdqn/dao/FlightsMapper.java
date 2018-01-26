package cn.bdqn.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bdqn.pojo.Flight_ticket;
import cn.bdqn.pojo.Flights;

public interface FlightsMapper {

	//ͨ��ʱ���ѯ����
	List<Flights> getSelectFlights(@Param("time")Date time,@Param("takeoffAirportName")String takeoffAirportName,@Param("landingAirportName")String landingAirportName);
	//ͨ��id��ȡ��ɽ���ʱ�Ļ���
	String getSelectAirports(int id);
	//ͨ������id��ȡ��������
	List<Flight_ticket> getSelectAirportsTicket(int flightId);
}
