package com.bdi.sp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bdi.sp.dao.DepartDAO;
import com.bdi.sp.vo.Depart;

@Repository
public class DepartDAOImpl implements DepartDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<Depart> selectDepartList(Depart dp) {
		return ss.selectList("com.bdi.sp.DepartMapper.selectDepartList");
	}

	@Override
	public Depart selectDepart(int dino) {
		return ss.selectOne("com.bdi.sp.DepartMapper.selectDepart");
	}

}
