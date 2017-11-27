package com.hjp.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hjp.ssm.po.ItemsCustom;
import com.hjp.ssm.service.ItemsService;

@Controller
public class itemsController {

	@Autowired
	private ItemsService itemsService;
	
	@RequestMapping("/itemsView")
	public ModelAndView itemsView(@RequestParam(value = "id", required = true) Integer items_id)
			throws Exception {
		
		ItemsCustom item=itemsService.findItemsById(items_id);
		ModelAndView modelAndView = new ModelAndView();
		
		//将商品信息放到model
		modelAndView.addObject("itemsCustom", item);
		modelAndView.setViewName("items/item");

		return modelAndView;
	}
}
