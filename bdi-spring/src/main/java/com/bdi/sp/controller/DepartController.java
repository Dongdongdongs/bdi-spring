package com.bdi.sp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdi.sp.service.DepartService;
import com.bdi.sp.vo.Depart;

@Controller
public class DepartController {
	private static final Logger logger = LoggerFactory.getLogger(JapanController.class);
	
	@Autowired
	private DepartService ds;
	
	@RequestMapping(value="/departs", method=RequestMethod.GET)
	public @ResponseBody List<Depart> getDepartList(@ModelAttribute Depart dp){
		return ds.selectDepartList(null);
	}
}
