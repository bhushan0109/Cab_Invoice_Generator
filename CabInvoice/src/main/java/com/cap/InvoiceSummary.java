package com.cap;

//creating invoice summary class
public class InvoiceSummary {

	public int numberOfRides;
	public double totalFare;			//Attributes
	public double averageFare;
	//constructor
	public InvoiceSummary(int numberOfRides, double totalFare) {
		this.numberOfRides = numberOfRides;
		this.totalFare = totalFare;
		this.averageFare = totalFare / numberOfRides;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		InvoiceSummary that = (InvoiceSummary) o;
		return numberOfRides == that.numberOfRides && Double.compare(that.totalFare, totalFare) == 0
				&& Double.compare(that.averageFare, averageFare) == 0;
	}
}
