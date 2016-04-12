package redhat.airline;

import java.util.Date;

public class FlightInfo impelements java.io.Serializable {
    
    private static final long serialVersionUID = 1L;
	
    public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getDeparturedatetime() {
		return departuredatetime;
	}
	public void setDeparturedatetime(Date departuredatetime) {
		this.departuredatetime = departuredatetime;
	}
	public Date getArrivaldatetime() {
		return arrivaldatetime;
	}
	public void setArrivaldatetime(Date arrivaldatetime) {
		this.arrivaldatetime = arrivaldatetime;
	}
private String flightnumber;
private String carrier;
private String origin;
private String destination;
private Date departuredatetime;
private Date arrivaldatetime;
public String getFlightnumber() {
	return flightnumber;
}
public void setFlightnumber(String flightnumber) {
	this.flightnumber = flightnumber;
}
}
