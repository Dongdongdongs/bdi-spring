package com.bdi.sp.service;

import java.util.List;

import com.bdi.sp.vo.Depart;

public interface DepartService {
	
	public List<Depart> selectDepartList(Depart dp);
	public Depart selectDepart(int dino);
}
