package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.BussiteDao;
import entity.Bussite;
import service.BussiteService;

@Service
public class BussiteServiceImpl implements BussiteService {

	@Autowired
	private BussiteDao bussiteDao;
	
	/**
	 * 新增站点信息
	 */
	public void addBusSite(Bussite bussite){
		bussiteDao.addBusSite(bussite);
	}

	/**
	 * 根据线路名称，查询站点信息
	 */
	@Override
	public List<Bussite> queryBusLine(Integer lineName) {
		return bussiteDao.queryBusLine(lineName);
	}
	
}
