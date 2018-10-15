package com.bdi.sp.dao;

import java.util.List;

import com.bdi.sp.vo.Depart;

public interface DepartDAO {

	public List<Depart> selectDepartList(Depart dp);
	public Depart selectDepart(int dino);
}
