package com.qrabbit.youpinghui.controller;

import java.util.Map;

import com.qrabbit.youpinghui.service.ItemSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/itemsearch-ms")
public class ItemSearchController {
	
	@Autowired
	private ItemSearchService itemSearchService;
	
	@RequestMapping("/search")
	public Map search(@RequestBody Map searchMap){
		System.out.println(searchMap);
		return itemSearchService.search(searchMap);		
	}

}
