package com.booking.code;

import java.util.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Train train=new Train();
		Passenger p=new Passenger();
		TicketCancellation t=new TicketCancellation();
		TrainRoutes tr=new TrainRoutes();
		Scanner sc=new Scanner(System.in);
		boolean registered=true;
		String source=null;
		String destination = null;
		int start=0,end=0;
		
		while(true)
		{
		System.out.println();
		System.out.println("1. Ticket Booking  2. Ticket Cancelling 3. Ticket Details 4.Exit");
		int option=sc.nextInt();
		
		if(option==1)
		{
		
		System.out.println("Enter the details:");
		System.out.print("Enter name :");
		String name=sc.next();
		System.out.print("Enter source: 1-Chennai 2-Vellore 3-Salem 4-Erode 5-Tiruppur 6-Coimbatore");
		start=sc.nextInt();
		String starting_point = tr.decideSource(start);
		if(starting_point.equals(""))
		{
			System.out.println("Your source point is wrong!!!");
			continue;
		}
		else
		{
		  source=new String(starting_point);
		}
		
		System.out.print("Enter destination: 1-Chennai 2-Vellore 3-Salem 4-Erode 5-Tiruppur 6-Coimbatore");
		end=sc.nextInt();
		String ending_point = tr.decideDestination(end);
		if(ending_point.equals(""))
		{
			System.out.println("Your destination point is wrong!!!");
			continue;
		}
		else
		{
		  destination=new String(ending_point);
		}
		
		System.out.print("Enter date :");
		String date_of_journey=sc.next();
		System.out.print("Enter the type of seat: 1-Premium 2-Normal");
		String type_of_seat=sc.next();
		if(!(type_of_seat.equals("1") || type_of_seat.equals("2")))
		{
			System.out.print("Enter valid type of seat: 1-Premium 2-Normal");
			type_of_seat=sc.next();
		}
		
		int cost=train.calculatePrice(type_of_seat,start,end);
		registered=p.addDetails(name, source, destination, date_of_journey, type_of_seat,cost);
		if(registered == true)
		{
		    System.out.println("Ticket Booked Successfully:)");
		    System.out.println("Your Passenger ID is "+p.getPassenger_id());
		}
		
		}
		
		if(option==2)
		{
			System.out.print("Passenger ID");
			int passenger_id=sc.nextInt();
			t.removePassenger(passenger_id);
		}
		if(option==3)
		{
		p.printDetails();
		}
		
		if(option==4)
		{
			break;
		}
		
		}
	}

}
