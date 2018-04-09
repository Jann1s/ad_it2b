package com.it2b.adFinalAssignment;

public class Item {
	
	private String itemNumber;
	private String name;
	private Integer year;
	private String theme;
	private String subTheme;
	private Integer pieces;
	private String minifigures;
	private String imageUrl;
	private Double priceGBP;
	private Double priceUSD;
	private Double priceCAD;
	private Double priceEUR;
	private String packaging;
	private String availability;
	
	public Item() {
		
	}

	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getSubTheme() {
		return subTheme;
	}

	public void setSubTheme(String subTheme) {
		this.subTheme = subTheme;
	}

	public Integer getPieces() {
		return pieces;
	}

	public void setPieces(Integer pieces) {
		this.pieces = pieces;
	}

	public String getMinifigures() {
		return minifigures;
	}

	public void setMinifigures(String minifigures) {
		this.minifigures = minifigures;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Double getPriceGBP() {
		return priceGBP;
	}

	public void setPriceGBP(Double priceGBP) {
		this.priceGBP = priceGBP;
	}

	public Double getPriceUSD() {
		return priceUSD;
	}

	public void setPriceUSD(Double priceUSD) {
		this.priceUSD = priceUSD;
	}

	public Double getPriceCAD() {
		return priceCAD;
	}

	public void setPriceCAD(Double priceCAD) {
		this.priceCAD = priceCAD;
	}

	public Double getPriceEUR() {
		return priceEUR;
	}

	public void setPriceEUR(Double priceEUR) {
		this.priceEUR = priceEUR;
	}

	public String getPackaging() {
		return packaging;
	}

	public void setPackaging(String packaging) {
		this.packaging = packaging;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}
}