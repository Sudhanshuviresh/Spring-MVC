package com.cg.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Prod implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private int pid;
	private String description;
	private String pname;
	private double price;
	
	public Prod() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Shopping [pid=" + pid + ", description=" + description + ", pname=" + pname + ", price=" + price + "]";
	}
	
	
}
