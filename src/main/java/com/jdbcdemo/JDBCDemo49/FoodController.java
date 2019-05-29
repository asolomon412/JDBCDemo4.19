package com.jdbcdemo.JDBCDemo49;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FoodController {
	
	@Autowired
	FoodJdbcDao dao;
	
	@RequestMapping("/")
	public ModelAndView index() {
		System.out.println(dao.findAllFoods());
		return new ModelAndView("index", "test", dao.findAllFoods());
	}

}
