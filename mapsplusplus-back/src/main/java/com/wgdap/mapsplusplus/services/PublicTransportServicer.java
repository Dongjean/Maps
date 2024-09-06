package com.wgdap.mapsplusplus.services;

public class PublicTransportServicer {
	
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
    
    public static String[] getPrice(String Start, String End) {
        //Get the Price Data
        String[] str = {"Eat", "Shit", "Price"};
        
		System.out.println(Start);
		System.out.println(End);
		System.out.println("Query parameter data is successfully received at Service Layer to be processed.");
        
        return str;
    }
}
