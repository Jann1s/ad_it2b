package com.it2b.adFinalAssignment;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import com.it2b.adFinalAssignment.algos.MyStack;
import com.it2b.adFinalAssignment.algos.QuickSort;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.Iterable;
import java.util.ArrayList;
import java.util.List;
import java.lang.Integer;

public class FinalAssignment {

	private static List<Item> items;
	
	public static void main(String[] args) {
		
		//Try to load the CSV file "legosets.csv"
		try {
			loadCSV();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//put in here some tests of your sorting methods...
		testQuickSort();
		//testMyStack();
	}
	
	private static void testMyStack() {
		
		MyStack mS = new MyStack();
		
		System.out.println("isEmpty: " + mS.isEmpty());
		
		mS.push(1);
		mS.push(3);
		mS.push(5);
		mS.push(8);
		
		System.out.println("Peek: " + mS.peek());
		System.out.println("Got: " + mS.pop());
		System.out.println("Got: " + mS.pop());
		System.out.println("Got: " + mS.search(5));
		System.out.println("Got: " + mS.search(3));
		System.out.println("isEmpty: " + mS.isEmpty());
	}
	
	private static void testQuickSort() {
		
		QuickSort qS = new QuickSort();
		
		/*
		 * Test String sorting with Item name
		 */
		String[] testString = new String[items.size()];
		
		//Fill String array with the article names
		for (int i = 0; i < items.size(); i++) {
			testString[i] = items.get(i).getName();
			System.out.println(testString[i]);
		}
		
		testString = (String[])qS.sort(testString);	//Sort the array
		System.out.println("\n\n\n!!!!!!!!!!SORTED!!!!!!!!!!!!\n\n\n");
		
		//Output new array
		for (int i = 0; i < testString.length; i++) {
			System.out.println(testString[i]);
		}
		
		
		/*
		 * Test DOUBLE sotring with Item Pieces
		 */
		Double[] testDouble = new Double[items.size()];
		
		for (int i = 0; i < items.size(); i++) {
			testDouble[i] = items.get(i).getPriceGBP();
			System.out.println(testDouble[i]);
		}
		
		testDouble = (Double[])qS.sort(testDouble);	//Sort the array
		System.out.println("\n\n\n!!!!!!!!!!SORTED!!!!!!!!!!!!\n\n\n");
		
		//Output new array
		for (int i = 0; i < testDouble.length; i++) {
			System.out.println(testDouble[i]);
		}
	}
	
	
	
	private static void loadCSV() throws IOException {
		items = new ArrayList<Item>();
		
		Reader in = new FileReader("legosets.csv");
		Iterable<CSVRecord> records = CSVFormat.EXCEL.withFirstRecordAsHeader().parse(in);
		for (CSVRecord record : records) {
			
			items.add(new Item());
			
			items.get(items.size() - 1).setItemNumber(record.get("Item_Number"));
			items.get(items.size() - 1).setName(record.get("Name"));
			items.get(items.size() - 1).setYear(Integer.parseInt(record.get("Year")));
			items.get(items.size() - 1).setTheme(record.get("Theme"));
			items.get(items.size() - 1).setSubTheme(record.get("Subtheme"));
			
			if (!record.get("Pieces").equals("NA")) {
				items.get(items.size() - 1).setPieces(Integer.parseInt(record.get("Pieces")));
			} else {
				items.get(items.size() - 1).setPieces(Integer.MAX_VALUE);
			}
			
			items.get(items.size() - 1).setMinifigures(record.get("Minifigures"));
			items.get(items.size() - 1).setImageUrl(record.get("Image_URL"));
			
			if (!record.get("GBP_MSRP").equals("NA")) {
				items.get(items.size() - 1).setPriceGBP(Double.parseDouble(record.get("GBP_MSRP")));
			} else {
				items.get(items.size() - 1).setPriceGBP(Double.MAX_VALUE);
			}
			
			if (!record.get("USD_MSRP").equals("NA")) {
				items.get(items.size() - 1).setPriceUSD(Double.parseDouble(record.get("USD_MSRP")));
			} else {
				items.get(items.size() - 1).setPriceUSD(Double.MAX_VALUE);
			}
			
			if (!record.get("CAD_MSRP").equals("NA")) {
				items.get(items.size() - 1).setPriceCAD(Double.parseDouble(record.get("CAD_MSRP")));
			} else {
				items.get(items.size() - 1).setPriceCAD(Double.MAX_VALUE);
			}
			
			if (!record.get("EUR_MSRP").equals("NA")) {
				items.get(items.size() - 1).setPriceEUR(Double.parseDouble(record.get("EUR_MSRP")));
			} else {
				items.get(items.size() - 1).setPriceEUR(Double.MAX_VALUE);
			}
			
			items.get(items.size() - 1).setPackaging(record.get("Packaging"));
			items.get(items.size() - 1).setAvailability(record.get("Availability"));
		}
	}

}