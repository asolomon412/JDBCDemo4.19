package com.jdbcdemo.JDBCDemo49;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping("add")
	public ModelAndView addForm() {
		return new ModelAndView("form-page");
	}
	
	@RequestMapping("add-food")
	public ModelAndView consumeFood(@RequestParam("name") String n, @RequestParam("category") String c, 
			@RequestParam("description") String d) {
		dao.addFood(n, c, d);
		return new ModelAndView("redirect:/");
		
	}
	
	@RequestMapping("update-form")
	public ModelAndView updateFood(@RequestParam("id") String id) {
		
		return new ModelAndView("update", "id", id);
		
	}
	
	@RequestMapping("update-food")
	public ModelAndView consumeFood(Food food) {
		dao.updateFood(food);
		return new ModelAndView("redirect:/");
		
	}
	
	@RequestMapping("delete")
	public ModelAndView deleteItem(@RequestParam("id") int id) {
		dao.deleteFood(id);
		return new ModelAndView("redirect:/");
	}

}
