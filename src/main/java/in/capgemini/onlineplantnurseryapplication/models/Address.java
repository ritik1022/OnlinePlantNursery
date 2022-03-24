package in.capgemini.onlineplantnurseryapplication.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="address_id")
private int addressid;
	@Column(name="houseNo")
private String houseNo;
	@Column(name="colony")
private String colony;
	@Column(name="city")
private String city;
	@Column(name="state")
private String state;
	@Column(name="pincode")
private int pincode;
	@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL,mappedBy="address")
private Customer customer;


public Address(int addressid, String houseNo, String coloy, String city, String state, int pincode) {
	super();
	this.addressid = addressid;
	this.houseNo = houseNo;
	this.colony = colony;
	this.city = city;
	this.state = state;
	this.pincode = pincode;
}


public Address() {
	super();
	// TODO Auto-generated constructor stub
}


public int getAddressid() {
	return addressid;
}


public void setAddressid(int addressid) {
	this.addressid = addressid;
}


public String getHouseNo() {
	return houseNo;
}


public void setHouseNo(String houseNo) {
	this.houseNo = houseNo;
}


public String getColony() {
	return colony;
}


public void setColony(String colony) {
	this.colony = colony;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public String getState() {
	return state;
}


public void setState(String state) {
	this.state = state;
}


public int getPincode() {
	return pincode;
}


public void setPincode(int pincode) {
	this.pincode = pincode;
}



}

