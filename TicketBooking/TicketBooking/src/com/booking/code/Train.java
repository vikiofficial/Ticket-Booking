package com.booking.code;

import java.util.*;

public class Train {
	
	private static int premium=2;
	private static int normal=1;
	private static int tax=0;
	Scanner sc=new Scanner(System.in);
	Main m=new Main();
	
	int calculatePrice(String type_of_seat,int start,int end)
	{
		int price=0,distance=0;
		if(type_of_seat.equals("1") && premium>0)
		{
			distance = Math.abs(end-start);
			price+=((distance*2)+getTax());
			setTax(getTax() + 1);
			premium--;
		}
		else if(type_of_seat.equals("1") && premium==0)
		{
			if(normal>0)
			{
			   System.out.println("Premium seats are filled. Wanna book Normal seat? 1.Yes 2.No");
			   String normal_choice=Integer.toString(sc.nextInt());
			   if(normal_choice.equals("1"))
			   {
				  if(normal>0)
				  {
					price+=distance*1;
					normal--;
					System.out.println("Normal seat is booked:)");
				  }
				  else
				  {
					System.out.println("Normal seats are filled:(");
					return -1;
				  }
			   }
			   else
			   {
				  System.out.println("You are not wished to book normal seat!");
				  return -1;
			   }
			}
			else
			{
				System.out.println("Both premium and normal seats are filled:(");
				return -1;
			}
		}
		else	
		{
			if(normal>0)
			{
				price+=distance*1;
				normal--;
				System.out.println("Normal seat is booked:)");
			}
			else
			{
				System.out.println("Normal seats are filled:(");
				return -1;
			}
		}
		return price;
	}
	
	
	
	int seatTypeAvailability(String seat_type)
	{
		if(premium>0 && seat_type.equals("1"))
		{
			return 1;
		}
		else if(premium==0 && normal>0 && seat_type.equals("1"))
		{
			return 2;
		}
		else if(normal>0 && seat_type.equals("2"))
		{
			return 2;
		}
		
		return -1;
	}



	public static int getTax() {
		return tax;
	}



	public static void setTax(int tax) {
		Train.tax = tax;
	}
}
