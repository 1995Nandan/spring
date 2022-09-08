package com.xworkz.nandan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Display {
	@Value("5 inches")
	private String size;
	
	@Value("5000.00")
	private double price;
	
	@Autowired
	private Tv tv;
	
	
	public Display() {
System.out.println("display bean is created");	

}

	@Override
	public String toString() {
		return "Display [size=" + size + ", price=" + price + ", tv=" + tv + "]";
	}	

}
