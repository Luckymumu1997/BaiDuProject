package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.Bussite;
import service.BussiteService;

@Controller
public class IndexController {
	//自动注入
	@Autowired
	private BussiteService bussiteService;
	
	@RequestMapping("index")
	public String index(){
		return "index";
	}
	
	/**
	 * 添加站点信息
	 * @param bussite
	 */
	@RequestMapping("saveSite")
	@ResponseBody
	public void saveSite(Bussite bussite){
		bussiteService.addBusSite(bussite);
	}
	
	/**
	 * 根据线路名称，查询站点信息
	 * @param lineName
	 */
	@RequestMapping("queryBusLine")
	@ResponseBody
	public List<Bussite> queryBusLine(Integer lineName){
		return bussiteService.queryBusLine(lineName);
	}
}
