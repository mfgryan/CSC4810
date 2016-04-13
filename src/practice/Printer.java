package practice;

import java.util.ArrayList;

public class Printer {
	
	private String ls = "|"; //default line separator
	Object printerObject;
	Printer p;
	
	public static Printer createPrinter(Object o){
		//add all object printers here
		if(o instanceof AttributeExtractor){
			return new AttributeExtractorPrinter((AttributeExtractor)o);
		}else{
			return new Printer();
		}		
	}
	
	public Printer(){
		
	}
	
	public void printAllArrays(){
		System.out.println("no arrays here");
	}
	
	public void printAllStrings(){
		System.out.println("No strings here");
	}
	
	public void printAllInts(){
		System.out.println("No ints here");
	}
	
	public void setLs(String ls){
		this.ls = ls;
	}
}
