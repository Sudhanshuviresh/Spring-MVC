package com.cg.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.cg.beans.Prod;
import com.cg.service.ProdService;


@Controller
public class ProdController {

	@Autowired
	Prod product;
	
	@Autowired
	ProdService productService;
	
	@RequestMapping("/")
		public ModelAndView displayAll() {
			ModelAndView modelView=new ModelAndView();
			List<Prod> traineelist=productService.getAllProduct();
			modelView.addObject("productlist",traineelist);
			modelView.setViewName("producthome");
			return modelView;
			
	
	}

	
	@RequestMapping("/orderpage")
	
	public ModelAndView dorder(@RequestParam int pid) {
		ModelAndView modelView=new ModelAndView();
		Prod product=productService.getById(pid);
		modelView.addObject("product",product);
		modelView.setViewName("productorder");
		return modelView;
		

}
	
	
@RequestMapping("/summary")
	
	public ModelAndView summary(@RequestParam String name,
			@RequestParam double price,@RequestParam int quantity,@RequestParam String buy) {
		ModelAndView modelView=new ModelAndView();
		modelView.addObject("name", name);
		double total=price*quantity;
		modelView.addObject("total",total);
		modelView.setViewName("summary");
		return modelView;
		

}
}
