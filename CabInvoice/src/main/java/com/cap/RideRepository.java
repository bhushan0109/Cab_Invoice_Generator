package com.cap;

import java.util.HashMap;
import java.util.Map;

//creating riderepository class
public class RideRepository {
	// hashmap implementation
	Map<String, Ride[]> userRides = new HashMap<>();

//addRideForUse method
	public void addRideForUser(String userId, Ride[] rides) {

		userRides.put(userId, rides);
	}

//getRidesForUser method
	public Ride[] getRidesForUser(String userId) {
		return userRides.get(userId);
	}
}