package com.wgdap.mapsplusplus.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wgdap.mapsplusplus.services.CarServicer;

@RestController
public class CarController {

	//GET Methods
	@RequestMapping(method=RequestMethod.GET, value="/car/get/route")
	private String[] getRoute(
			@RequestParam(name="Start", required = true) String Start,
			@RequestParam(name="End", required = true) String End
	) {
		String[] out = CarServicer.getRoute(Start, End);
		
		return out;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/car/get/time")
	private String[] getTime(
			@RequestParam(name="Start", required = true) String Start,
			@RequestParam(name="End", required = true) String End
	) {
		String[] out = CarServicer.getTime(Start, End);

		return out;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/car/get/erp")
	private String[] getERP(
			@RequestParam(name="Start", required = true) String Start,
			@RequestParam(name="End", required = true) String End
	) {
		String[] out = CarServicer.getERP(Start, End);

		return out;
	}
}
