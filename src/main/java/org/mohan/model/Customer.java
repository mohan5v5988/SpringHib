package org.mohan.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
public class Customer {
	@Id
	private String nid;
	private String name;
	private String address;
	private String email;
	private Date date;
	private long pnumber;
	
	public Customer() {
		
	}
	
	public Customer(String nid,String name,String address,String email,Date date,long pnumber){
		this.nid = nid;
		this.name = name;
		this.address = address;
		this.email = email;
		this.date = date;
		this.pnumber = pnumber;	
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getNid() {
		return nid;
	}
	public void setNid(String nid) {
		this.nid = nid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPnumber() {
		return pnumber;
	}
	public void setPnumber(long pnumber) {
		this.pnumber = pnumber;
	}
	public String toString() {
		return "NID : "+nid+" Name : "+name+" Address : "+address+
				" Phon number : "+pnumber+" Email : "+email+" Date of Birth : "+date;
	}

}
