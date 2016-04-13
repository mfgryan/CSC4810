package practice;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * looks for and extracts specified attributes from given text input
 * 
 */
public class AttributeExtractor {
	
	ArrayList<String> matches;
	ArrayList<String> startIndexes;
	ArrayList<String> endIndexes;
	
	String attributeName;
	String theRegex;
	String str2Check;
	int size;
	
	public AttributeExtractor(String name){
		this.matches = new ArrayList<String>();
		this.startIndexes = new ArrayList<String>();
		this.endIndexes = new ArrayList<String>();
		
		this.attributeName = name;
		this.size = 0;
	}
	
	public void regexChecker(String theRegex, String str2Check){
		this.theRegex = theRegex;
		this.str2Check = str2Check;
		
		Pattern checkRegex = Pattern.compile(theRegex);
		
		Matcher regexMatcher = checkRegex.matcher(str2Check);
		
		while(regexMatcher.find()){
			if(regexMatcher.group().length() !=0){
				matches.add(regexMatcher.group().trim()); //System.out.println("Start index: " + regexMatcher.start()); //same for end
				startIndexes.add(regexMatcher.start() + "");
				endIndexes.add(regexMatcher.end()+"");
				size++;
			}
		}
		
	}
	
	public ArrayList<String> getMatches(){
		return matches;
	}

	public ArrayList<String> getStartIndexes() {
		return startIndexes;
	}
	
	public String getStartIndexes(int i) {
		return startIndexes.get(i);
	}

	public ArrayList<String> getEndIndexes() {
		return endIndexes;
	}
	
	public String getEndIndexes(int i) {
		return endIndexes.get(i);
	}
	
	public int getSize(){
		return size;
	}

	public String getTheRegex() {
		return theRegex;
	}

	public String getStr2Check() {
		return str2Check;
	}

	public String getAttributeName() {
		return attributeName;
	}
	
}
