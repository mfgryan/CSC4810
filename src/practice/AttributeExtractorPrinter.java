package practice;

public class AttributeExtractorPrinter extends Printer{
	
	AttributeExtractor a;
	String ls;
	
	public AttributeExtractorPrinter(AttributeExtractor a){
		this.a = a;
	}
	
	public void printAllArrays(){
		
		System.out.println("name: " + a.getAttributeName());
		System.out.println("Regex: " + a.getTheRegex());
		System.out.println("String: " + a.getStr2Check());
		
		System.out.println(a.size + " matches: ");
		
		for(String string: a.getMatches())
			System.out.print(string);
		
		System.out.print("\nStart,End:\n");
		
		for(int i = 0; i< a.getSize(); i++)
			System.out.print(a.getStartIndexes(i) +","+ a.getEndIndexes(i) + " | ");
		System.out.println();
	}
	
	public void setLs(String ls){
		this.ls = ls;
	}
}
