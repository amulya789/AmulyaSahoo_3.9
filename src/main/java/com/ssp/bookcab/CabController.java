package com.ssp.bookcab;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
/* @RequestMapping("/getdriver") */
public class CabController {
	
	
	@Autowired
	DriverRepo driverRepo;
	
	@RequestMapping(method = RequestMethod.GET, value = "/getMostIdealDriver")
	public List<DriverInfo> getAllCabs() {
		
		return (ArrayList<DriverInfo>) driverRepo.getDriverInfos();
	}

}
