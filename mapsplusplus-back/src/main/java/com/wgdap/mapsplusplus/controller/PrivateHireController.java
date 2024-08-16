package com.wgdap.mapsplusplus.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wgdap.mapsplusplus.services.PrivateHireServicer;

@RestController
public class PrivateHireController {

	//GET Methods
	@RequestMapping(method=RequestMethod.GET, value="/private-hire/get/data/grab")
	private String[] getGrabData(
			@RequestParam(name="Start", required = true) String Start,
			@RequestParam(name="End", required = true) String End
	) {
		String[] out = PrivateHireServicer.getGrabData(Start, End);
		
		return out;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/private-hire/get/data/gojek")
	private String[] getGojekData(
			@RequestParam(name="Start", required = true) String Start,
			@RequestParam(name="End", required = true) String End
	) {
		String[] out = PrivateHireServicer.getGojekData(Start, End);

		return out;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/private-hire/get/data/comfort")
	private String[] getComfortData(
			@RequestParam(name="Start", required = true) String Start,
			@RequestParam(name="End", required = true) String End
	) {
		String[] out = PrivateHireServicer.getComfortData(Start, End);

		return out;
	}
}
