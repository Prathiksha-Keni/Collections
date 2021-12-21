package com.xworkz.Collection.Perfume.DTO;

public class PerfumeDto {

	private String brand;
	private int price;
	private String quantity;
	private String fragnance;
	public PerfumeDto(String brand, int price, String quantity, String fragnance) {
		System.out.println("DTO Created");
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
		this.fragnance = fragnance;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getFragnance() {
		return fragnance;
	}
	public void setFragnance(String fragnance) {
		this.fragnance = fragnance;
	}
	
	
	
}
