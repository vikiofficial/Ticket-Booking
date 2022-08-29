package com.booking.code;

import java.util.*;

class TrainRoutes {
	
	static
	{
	 List<String> route=new LinkedList<>();
	 route.add("Chennai");
	 route.add("Vellore");
	 route.add("Salem");
	 route.add("Erode");
	 route.add("Tiruppur");
	 route.add("Coimbatore");
	 
	}
	
	public String decideSource(int source)
	{
		String starting_city = "";
		if(source==1)
		{
			starting_city = "Chennai";
		}
		else if(source==2)
		{
			starting_city = "Vellore";
		}
		else if(source==3)
		{
			starting_city = "Salem";
		}
		else if(source==4)
		{
			starting_city = "Erode";
		}
		else if(source==5)
		{
			starting_city = "Tiruppur";
		}
		else if(source==6)
		{
			System.out.println("This is destination point of train!!!");
		}
		
		return starting_city;
		
	}
	
	public String decideDestination(int destination)
	{
		String ending_city = "";
		if(destination==1)
		{
			System.out.println("This is source point of train!!!");
		}
		else if(destination==2)
		{
			ending_city = "Vellore";
		}
		else if(destination==3)
		{
			ending_city = "Salem";
		}
		else if(destination==4)
		{
			ending_city = "Erode";
		}
		else if(destination==5)
		{
			ending_city = "Tiruppur";
		}
		else if(destination==6)
		{
			ending_city = "Coimbatore";
		}
		
		return ending_city;
		
	}
	
}
