package dao;

import java.util.List;

import entity.Bussite;

public interface BussiteDao {

	/**
	 * 新增站点信息
	 * @param bussite
	 */
	public void addBusSite(Bussite bussite);
	
	/**
	 * 根据线路名称，查询站点信息
	 */
	public List<Bussite> queryBusLine(Integer lineName);
}
