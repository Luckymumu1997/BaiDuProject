package service;

import java.util.List;

import entity.Bussite;


public interface BussiteService {

	/**
	 * 新增站点信息
	 */
	public void addBusSite(Bussite bussite);

	/**
	 * 根据线路名称，查询站点信息
	 * @param lineName
	 */
	public List<Bussite> queryBusLine(Integer lineName);
	
}
