package cn.bdqn.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;

import cn.bdqn.pojo.Flights;
import cn.bdqn.service.FlightsService;

@Controller
public class FlightsController {

	private Logger logger = Logger.getLogger(FlightsController.class);
	@Resource
	public FlightsService flightsService;

	@RequestMapping(value = "/main.do")
	public String main() {
		logger.info("进入=============================>222");
		return "main";
	}

	@RequestMapping(value = "/show.do",method=RequestMethod.POST)
	public String show(Model model,
			@RequestParam(value = "time", required = false) String time,
			@RequestParam(value = "takeoff", required = false) String takeoff,
			@RequestParam(value = "landing", required = false) String landing) {
		logger.info("查询中=====================>");
		SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
		Date d;
		try {
			d = s.parse(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			d=null;
		}
		List<Flights> flightList = flightsService
				.select(d, takeoff, landing);
			model.addAttribute("time", time);
			model.addAttribute("takeoff", takeoff);
			model.addAttribute("landing", landing);
			model.addAttribute("flightList", flightList);
		return "main";
	}
	@RequestMapping(value="/yibu.do",method=RequestMethod.POST)
	@ResponseBody
	public Object yibu(@RequestParam("id")String id){
		System.out.println("==yibu==");
		return JSONArray.toJSONString(flightsService.select2(Integer.parseInt(id)));
	}
}
