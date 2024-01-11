package com.beautyparlour.beans;

import javax.persistence.Entity;

@Entity
public class Parlour {
private String parlour_name;
private String location;
private int fees;
public String getParlour_name() {
	return parlour_name;
}
public void setParlour_name(String parlour_name) {
	this.parlour_name = parlour_name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getFees() {
	return fees;
}
public void setFees(int fees) {
	this.fees = fees;
}
@Override
public String toString() {
	return "Parlour [parlour_name=" + parlour_name + ", location=" + location + ", fees=" + fees + "]";
}

}
