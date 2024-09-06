package com.wgdap.mapsplusplus.services;

public class PrivateHireServicer {

	//GET Methods
	public static String[] getGrabData(String Start, String End) {
		//Get the Grab Data
		String[] str = {"Eat", "Shit", "Grab"};
		
		System.out.println(Start);
		System.out.println(End);
		System.out.println("Query parameter data is successfully received at Service Layer to be processed.");
		
		return str;
	}
	
    public static String[] getGojekData(String Start, String End) {
        //Get the Gojek Data
        String[] str = {"Eat", "Shit", "Gojek"};
        
		System.out.println(Start);
		System.out.println(End);
		System.out.println("Query parameter data is successfully received at Service Layer to be processed.");
        
        return str;
    }
    
    public static String[] getComfortData(String Start, String End) {
        //Get the Comfort Data
        String[] str = {"Eat", "Shit", "Comfort"};
        
		System.out.println(Start);
		System.out.println(End);
		System.out.println("Query parameter data is successfully received at Service Layer to be processed.");
        
        return str;
    }
}
