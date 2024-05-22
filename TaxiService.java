/**
*  This is the only class in this project with requirements. You should only
*  have to work within this class to complete the project.
*/
public class TaxiService {

	/**
	 * Ride cannot have more than 4 passengers. If ride has more than 4 passengers, throw InvalidRideException  
	 * Ride must have a driver and at least 1 passenger. Hint: if driver is null, a driver hasn't been assigned. 
     * If the ride does not have a driver, throw InvalidRideException. If the ride has less than 1 passenger, throw InvalidRideException. 
	 * 
	 * @param ride
	 * @return
	 */
	
    public void validate(Ride ride) throws InvalidRideException { 
        if (ride.getDriver() == null) { 
            throw new InvalidRideException("A driver hasn't been assigned."); 
        } 
        if (ride.getPassengers() == null || ride.getPassengers().length < 1) { 
            throw new InvalidRideException("Ride must have at least 1 passenger."); 
        } 
        if (ride.getPassengers().length > 4) { 
            throw new InvalidRideException("Ride cannot have more than 4 passengers."); 
        } 
    }
	
	/**
	 * Return the number of passengers with 
	 * accountType = BUSINESS.
	 * 
	 * Hint: Use the equals method in String class
	 * to compare Strings.
	 * 
	 * @param ride
	 * @return
	 */
	
    public int business(Ride ride) { 
        int businessPassengers = 0; 
        for (Passenger passenger : ride.getPassengers()) { 
            if ("BUSINESS".equals(passenger.getAccountType())) { 
                businessPassengers++; 
            } 
        } 
        return businessPassengers; 
    }
	
}
