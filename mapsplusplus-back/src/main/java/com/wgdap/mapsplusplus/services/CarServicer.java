package com.wgdap.mapsplusplus.services;

public class CarServicer {

	//GET Methods
	public static String[] getRoute(String Start, String End) {
		//Get the Route Data
		String[] str = {"Eat", "Shit", "Route"};
		
		System.out.println(Start);
		System.out.println(End);
		System.out.println("Query parameter data is successfully received at Service Layer to be processed.");
		
		return str;
	}
	
    public static String[] getTime(String Start, String End) {
        //Get the Time Data
        String[] str = {"Eat", "Shit", "Time"};
        
		System.out.println(Start);
		System.out.println(End);
		System.out.println("Query parameter data is successfully received at Service Layer to be processed.");
        
        return str;
    }
    
    public static String[] getERP(String Start, String End) {
        //Get the ERP Data
        String[] str = {"Eat", "Shit", "ERP"};
        
		System.out.println(Start);
		System.out.println(End);
		System.out.println("Query parameter data is successfully received at Service Layer to be processed.");
        
        return str;
    }
}
