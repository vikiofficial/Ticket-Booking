package com.booking.code;

public class TicketCancellation extends Passenger {
	int refund=0;
	void removePassenger(int passenger_id)
	{
		int index=-1;
		for(int i=0;i<booking_list.size();i++)
		{
			String id=Integer.toString(passenger_id);
			if(booking_list.get(i).get(0).equals(id))
			{
				index=i;
				break;
			}
		}
		
		if(index>=0)
		{
			String seat_type = booking_list.get(index).get(5);
			if(seat_type.equals("1"))
			{
				reducePremiumCost();
				Train.setTax(Train.getTax() - 1);
				refund=2;
			}
			else if(seat_type.equals("2"))
			{
				reduceNormalCost();
				refund=1;
			}
		    booking_list.remove(index);
		    System.out.println("Your ticket is cancelled successfully!");
		    System.out.println("Your base amount Rs."+refund+" is refunded.");
		}
		else
		{
			System.out.println("You haven't booked yet!!!");
		}
	}
}
