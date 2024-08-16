package com.wgdap.mapsplusplus.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wgdap.mapsplusplus.services.PublicTransportServicer;

@RestController
public class PublicTransportController {

	@RequestMapping(method=RequestMethod.GET, value="/public-transport/get/route")
	private String[] getRoute(
			@RequestParam(name="Start", required = true) String Start,
			@RequestParam(name="End", required = true) String End
	) {
		String[] out = PublicTransportServicer.getRoute(Start, End);
		
		return out;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/public-transport/get/time")
	private String[] getTime(
			@RequestParam(name="Start", required = true) String Start,
			@RequestParam(name="End", required = true) String End
	) {
		String[] out = PublicTransportServicer.getTime(Start, End);

		return out;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/public-transport/get/price")
	private String[] getPrice(
			@RequestParam(name="Start", required = true) String Start,
			@RequestParam(name="End", required = true) String End
	) {
		String[] out = PublicTransportServicer.getPrice(Start, End);

		return out;
	}
}
