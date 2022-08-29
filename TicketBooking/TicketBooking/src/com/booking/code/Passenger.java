package com.booking.code;
import java.util.*;
class Passenger
{
	private static int passenger_id=0;
	private String name;
	private String source;
	private String destination;
	private String date_of_journey;
	private String type_of_seat;
	private static int total_revenue=0;
	
	Train t=new Train();
	LinkedList<LinkedList<String>> booking_list=new LinkedList<LinkedList<String>>();
	boolean addDetails(String name,String source,String destination,String date_of_journey,String type_of_seat,int cost)
	{
		LinkedList<String> temp=new LinkedList<>();
		temp.add(Integer.toString(getPassenger_id()));
		temp.add(name);
		temp.add(source);
		temp.add(destination);
		temp.add(date_of_journey);
		int type=t.seatTypeAvailability(type_of_seat);
		if(type==-1)
		{
			System.out.println("All seats are already booked.");
			return false;
		}
		
		temp.add(Integer.toString(type));
		if(cost==-1)
		{
			System.out.println("Sorry! Your selection is unavailable");
			return false;
		}
		else
		{
			total_revenue+=cost;
		    temp.add(Integer.toString(cost));
		}
		booking_list.add(temp);
		return true;
		
	}
	

	void printDetails()
	{
		for(int i=0;i<booking_list.size();i++)
		{
		System.out.println("Passenger ID : "+booking_list.get(i).get(0));
		System.out.println("Name : "+booking_list.get(i).get(1));
		System.out.println("Source : "+booking_list.get(i).get(2));
		System.out.println("Destination : "+booking_list.get(i).get(3));
		System.out.println("Date Of Journey : "+booking_list.get(i).get(4));
		System.out.println("Type Of Seat : "+((booking_list.get(i).get(5).equals("1"))?"Premium":"Normal"));
		System.out.println("Price :"+booking_list.get(i).get(6));
		}
	}

	public static int getPassenger_id() {
		return passenger_id;
	}
	
	public void reducePremiumCost()
	{
		total_revenue-=2;
	}
	
	public void reduceNormalCost()
	{
		total_revenue-=1;
	}

		
}
